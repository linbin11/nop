package orgtt.quartz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class QuartzJobBeanDemo extends QuartzJobBean implements StatefulJob{
	public static List<Long> list = new ArrayList<Long>();
	@SuppressWarnings("deprecation")
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {

		try {
			System.out.println(new Date().toLocaleString());
			Thread.sleep(2000l);
			System.out.println(new Date().toLocaleString());
		} catch (Exception e) {
			throw new JobExecutionException(e);
		}
	}
	
	public QuartzJobBeanDemo() {
		
	}
	


}
