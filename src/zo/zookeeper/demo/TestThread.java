package zo.zookeeper.demo;

import java.io.IOException;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

public class TestThread extends Thread {
	int i = 1;

	public void run() {
		ZooKeeper keeper = null;
		try {
			//192.168.219.76:2182
			keeper = new ZooKeeper("192.168.219.77:2182",10000, new Watcher() {
				@Override
				public void process(WatchedEvent event) {
					// TODO Auto-generated method stub
				}
			});
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (1 == i) {
			try {
				Thread.sleep(1000);
				SortSeqTest.runkk(keeper);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
