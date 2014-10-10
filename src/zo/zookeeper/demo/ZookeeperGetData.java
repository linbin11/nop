package zo.zookeeper.demo;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

public class ZookeeperGetData {

	public static void main(String[] args) throws Exception {
		final ZooKeeper keeper = new ZooKeeper("127.0.0.1:2181", 1000, new Watcher() {
			@Override
			public void process(WatchedEvent event) {
				// TODO Auto-generated method stub
			}
		});
//		if (keeper.exists("/model2", false)==null) {
//			//return;
//		}
//		keeper.getData("/model", new Watcher() {
//			@Override
//			public void process(WatchedEvent arg0) {
//				System.out.println("sadad66666");
//			}
//		}, null);
		//keeper.setData("/model", ObjectTools.getByteData("555adas"), -1);
		//byte[] bt = keeper.getData("/model", true, null);
		for (int i = 0; i < 50; i++) {
			new TestThread().start();
		}
		//System.out.println(ObjectTools.getByteData(bt));
	}
}
