package orgtt.quartz;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzStart {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("orgtt/quartz/spring.xml");
		ac.start();
		System.in.read();
	}
}
