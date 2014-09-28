import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestQuartyS236 {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean-quartz.xml");
		ac.start();
		System.in.read();
	}

}
