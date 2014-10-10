package zo.zookeeper.demo.pojo;

/**
 * Zookeeper数据源
 * 
 * @author 林斌
 * 
 */
public class ZookeeperData {

	/** zookeeper地址. */
	private String m_zookeeperUrl;
	/** zookeeper连接有效期(sessionTimeout). */
	private Integer m_sessionTimeout = 30000;

	public String getZookeeperUrl() {
		return m_zookeeperUrl;
	}

	public void setZookeeperUrl(String zookeeperUrl) {
		m_zookeeperUrl = zookeeperUrl;
	}

	public Integer getSessionTimeout() {
		return m_sessionTimeout;
	}

	public void setSessionTimeout(Integer sessionTimeout) {
		m_sessionTimeout = sessionTimeout;
	}

}
