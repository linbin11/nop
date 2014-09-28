package source.mybateis.demo.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import source.mybateis.demo.mapper.UdmUserMapper;
import source.mybateis.demo.pojo.UdmUserPojo;

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
