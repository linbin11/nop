package zo.zookeeper.demo;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

import zo.zookeeper.demo.pojo.PostInfo;

public class ZooKeeporTest {

	public static void main(String[] args) throws Exception {
		ZooKeeper keeper = new ZooKeeper("127.0.0.1:2181", 1000, new Watcher() {
			@Override
			public void process(WatchedEvent event) {
				// TODO Auto-generated method stub
				System.out.println("asdasd");
			}
		});
		PostInfo test = new PostInfo();
		test.setAuditDate(new Date());
		test.setAuditID("0asd222");
		test.setCreateDate(new Date());
		test.setCreateID("林斌001");
		test.setIconCls("..//ada.\\sadas");
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(out);
		oo.writeObject(test);
		byte[] bt = out.toByteArray();
		/**
		 * 创建一个znode 1.CreateMode 取值 PERSISTENT：持久化，这个目录节点存储的数据不会丢失
		 * PERSISTENT_SEQUENTIAL：
		 * 	顺序自动编号的目录节点，这种目录节点会根据当前已近存在的节点数自动加 1，
		 *  然后返回给客户端已经成功创建的目录节点名； 
		 * EPHEMERAL：临时目录节点，一旦创建这个节点的客户端与服务器端口也就是
		 * session过期超时，这种节点会被自动删除 
		 * EPHEMERAL_SEQUENTIAL：临时自动编号节点
		 */
		//keeper.create("/model", bt, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		//keeper.create("/model2", bt, Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
		System.in.read();
		// 删除节点 忽略版本
		 //keeper.delete("/model", -1);
	}

}
