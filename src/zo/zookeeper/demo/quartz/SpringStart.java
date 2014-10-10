package zo.zookeeper.demo.quartz;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("zo/zookeeper/demo/quartz/spring.xml");
		ac.start();
		System.in.read();
	}
}
