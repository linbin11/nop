package orgtt.quartz;

import java.util.ArrayList;
import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class QuartzJobBeanDemo extends QuartzJobBean implements StatefulJob{
	public static List<Long> list = new ArrayList<Long>();
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {

		try {
			Long start = System.currentTimeMillis();
			if (!list.isEmpty()) {
				System.out.println("与上次执行时间间隔="+(start-list.get(list.size()-1))/1000);
			}
			list.add(start);
			QuartzJob otargetObject = new QuartzJob();
			otargetObject.queryWrite();
		} catch (Exception e) {
			throw new JobExecutionException(e);
		}
	}
	
	public QuartzJobBeanDemo() {
		// TODO Auto-generated constructor stub
	}
	


}
