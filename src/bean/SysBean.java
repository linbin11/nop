package bean;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SysBean {

	public SysBean() {
	}
	
	public static void main(String[] args) {
		System.setProperty("ggg", "testsssBean");
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean tb = (TestBean) ac.getBean("testBean");
		System.out.println(tb.getGroup());
	}
	
	public static String getGroup() {
		return UUID.randomUUID().toString();
	}
	
	public static String getBean() {
		System.out.println("366");
		return "testBean";
	}

}
