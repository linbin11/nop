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
		keeper.create("/model", bt, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
	}
	
	
}
