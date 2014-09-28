import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.TestBean;


public class TestPor {

	public TestPor() {
	}
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ac.start();
		TestBean tb = (TestBean) ac.getBean("testBean");
		System.out.println(tb.getGroup());
	}

}
