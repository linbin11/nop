package zo.zookeeper.demo;

import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooDefs.Ids;

public class SortSeqTest {

	public static synchronized void runkk(ZooKeeper keeper) throws KeeperException, InterruptedException {
		Long a = System.currentTimeMillis();
		Long ff = 0l;
		if (keeper.exists("/next", true) == null) {
			ff = new Long(0l);
			keeper.create("/next", ObjectTools.getByteData(ff), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		} else {
			while (!keeper.getChildren("/next", false).isEmpty()) {
				continue;
			}
			if (keeper.getChildren("/next", false).isEmpty()) {
				keeper.create("/next/lock", ObjectTools.getByteData(ff), Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
			}
			ff = ObjectTools.getByteData(keeper.getData("/next", true, null));
			ff = ff + 1l;
			keeper.setData("/next", ObjectTools.getByteData(ff), -1);
			List<String> nodes = keeper.getChildren("/next", false);
			for (int i = 0; i < nodes.size(); i++) {
				keeper.delete("/next/" + nodes.get(i), -1);
			}
		}
		Long b = System.currentTimeMillis();
		Long s = b - a;
		System.out.println(Thread.currentThread().getId() + "---s=" + s + "--" + ff);
	}
}
