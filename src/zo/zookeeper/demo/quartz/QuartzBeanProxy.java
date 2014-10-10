package zo.zookeeper.demo.quartz;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;

import zo.zookeeper.demo.pojo.ZookeeperData;

/**
 * zookeeper集群任务调度代理类
 * @author 林斌
 *
 */
public class QuartzBeanProxy extends MethodInvokingFactoryBean implements MethodInterceptor {

	/** 代理方法名称. */
	private String m_methodName = "";
	/** 代理类名称. */
	private String m_className;
	/** zookeeper地址. */
	private String m_zookeeperUrl;
	/** zookeeper连接有效期(sessionTimeout). */
	private Integer m_sessionTimeout;
	/**zookeeper连接对象.*/
	private ZooKeeper m_keeper;
	/**注册节点ID.*/
	private String m_znodeNameId;
	public static final Logger LOGGER = LoggerFactory.getLogger(QuartzBeanProxy.class);
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if (null==m_className||m_zookeeperUrl==null||m_sessionTimeout==null||m_znodeNameId==null) {
			LOGGER.info("method:intercept, 传入参数不正确", new Object[]{m_zookeeperUrl,m_className,m_sessionTimeout,m_znodeNameId});
			return null;
		}
		if (!method.getName().equals(m_methodName)) {
			return null;
		}
		if (m_keeper==null) {
			try {
				m_keeper = new ZooKeeper(m_zookeeperUrl, getSessionTimeout(), new Watcher() {
					@Override
					public void process(WatchedEvent event) {
						LOGGER.info("连接ZooKeeper成功！");
					}
				});
			} catch (Exception e) {
				LOGGER.error("method:intercept, 获取ZooKeeper连接失败！"+e);
				return null;
			}
		}
		Object ob = null;
		if (lookStatusAndlock()) {
			ob = proxy.invokeSuper(obj, args);
			unlock();
		}
		return ob;
	}
	/**
	 * 获取任务可执行锁
	 * @return
	 * @throws InterruptedException 
	 * @throws KeeperException 
	 */
	private boolean lookStatusAndlock() throws Exception{
		try {
			if (m_keeper.exists("/quartzJobStatusWorkRoot", true)==null) {
				try {
					m_keeper.create("/quartzJobStatusWorkRoot", "quartzJobStatusWorkRoot".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
				} catch (Exception e) {
				}
			}
			m_keeper.create("/quartzJobStatusWorkRoot/"+m_znodeNameId, m_znodeNameId.getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
			return true;
		} catch (Exception e) {
			
		}
		return false;
	}
	
	/**
	 * 解锁
	 * @throws KeeperException 
	 * @throws InterruptedException 
	 */
	private void unlock() throws Exception{
		m_keeper.delete("/quartzJobStatusWorkRoot/"+m_znodeNameId, -1);
	}

	// ----------------getter/setter-----------------//
	public String getMethodName() {
		return m_methodName;
	}

	public void setMethodName(String methodName) {
		m_methodName = methodName;
	}

	public String getClassName() {
		return m_className;
	}

	public void setClassName(String className) {
		m_className = className;
		try {
			Class<?> classQuartz = Class.forName(m_className);
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(classQuartz);
			// 回调方法
			enhancer.setCallback(this);
			// 创建代理对象
			setTargetObject(enhancer);
			setTargetMethod("create");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getZookeeperUrl() {
		return m_zookeeperUrl;
	}

	public void setZookeeperUrl(String zookeeperUrl) {
		if (zookeeperUrl.startsWith("zookeeper://")) {
			String str= zookeeperUrl.replaceAll("zookeeper://", "").replaceAll("\\?backup=", ",");
			m_zookeeperUrl = str;
			return;
		}
		m_zookeeperUrl = zookeeperUrl;
	}

	public Integer getSessionTimeout() {
		if (m_sessionTimeout == null) {
			return 30000;
		}
		return m_sessionTimeout;
	}

	public void setSessionTimeout(Integer sessionTimeout) {
		m_sessionTimeout = sessionTimeout;
	}
	/**
	 * 注册节点ID
	 * @return
	 */
	public String getZnodeNameId() {
		return m_znodeNameId;
	}
	/**
	 * 注册节点ID
	 * @param znodeNameId
	 */
	public void setZnodeNameId(String znodeNameId) {
		m_znodeNameId = znodeNameId;
	}
	
	public void setZookeeperData(ZookeeperData zookeeperData) {
		if (m_zookeeperUrl == null) {
			setZookeeperUrl(zookeeperData.getZookeeperUrl());
		}
		if (m_sessionTimeout == null) {
			m_sessionTimeout = zookeeperData.getSessionTimeout();
		}
	}

}
