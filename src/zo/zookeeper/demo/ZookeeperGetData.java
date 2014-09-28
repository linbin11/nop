package zo.zookeeper.demo;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

public class ZookeeperGetData {

	public static void main(String[] args) throws Exception {
		ZooKeeper keeper = new ZooKeeper("127.0.0.1:2181", 1000, new Watcher() {
			@Override
			public void process(WatchedEvent event) {
				// TODO Auto-generated method stub
			}
		});
		byte[] bt = keeper.getData("/model", true, null);
		ByteArrayInputStream bi = new ByteArrayInputStream(bt);
		ObjectInputStream oi = new ObjectInputStream(bi);
		Object obj = oi.readObject();
		System.out.println(obj);
		bi.close();
		oi.close();
	}
}
