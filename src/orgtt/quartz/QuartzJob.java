package orgtt.quartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import orgtt.quartz.mybaties.mapper.UdmUserMapper;
import orgtt.quartz.mybaties.pojo.UdmUserPojo;


public class QuartzJob {

	public QuartzJob() {
		// TODO Auto-generated constructor stub
		
		
	}
	public static ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("source/spring-all.xml");
	public void queryWrite() {
		
		UdmUserMapper userMapper = (UdmUserMapper) ct.getBean("udmUserMapper");
		try {
			 String a = "GGG"+Math.random()*100;
			UdmUserPojo po = new UdmUserPojo();
			po.setPurchaseSupplySerialNo(a);
			userMapper.insertUdmUser(po);
			Thread.sleep(8000l);
			po = new UdmUserPojo();
			po.setPurchaseSupplySerialNo(a);
			userMapper.insertUdmUser(po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
