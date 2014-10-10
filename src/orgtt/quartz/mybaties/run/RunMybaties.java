package orgtt.quartz.mybaties.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import orgtt.quartz.mybaties.mapper.UdmUserMapper;
import orgtt.quartz.mybaties.pojo.UdmUserPojo;

public class RunMybaties {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("source/spring-all.xml");
		UdmUserMapper userMapper = (UdmUserMapper) ct.getBean("udmUserMapper");
		UdmUserPojo po = new UdmUserPojo();
		po.setPurchaseSupplySerialNo("AAA");
		userMapper.insertUdmUser(po);
		System.out.println(userMapper.findUdmUserPojos());
	}

}
