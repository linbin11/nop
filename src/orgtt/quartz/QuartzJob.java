package orgtt.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import source.mybateis.demo.mapper.UdmUserMapper;
import source.mybateis.demo.pojo.UdmUserPojo;


public class QuartzJob {

	public QuartzJob() {
		// TODO Auto-generated constructor stub
		
		
	}
	public static ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("source/spring-all.xml");
	public void queryWrite() {
		
		UdmUserMapper userMapper = (UdmUserMapper) ct.getBean("udmUserMapper");
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			 String a = "GGG"+Math.random()*100;
			String sss = sm.format(new Date());
			UdmUserPojo po = new UdmUserPojo();
			po.setPurchaseSupplySerialNo(a);
			userMapper.insertUdmUser(po);
			Thread.sleep(8000l);
			sss = sm.format(new Date());
			po = new UdmUserPojo();
			po.setPurchaseSupplySerialNo(a);
			userMapper.insertUdmUser(po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
