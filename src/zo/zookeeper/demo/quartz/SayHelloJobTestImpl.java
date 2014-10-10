package zo.zookeeper.demo.quartz;

public class SayHelloJobTestImpl implements SayHelloJobTest {
	
	public void sayHello(){
		try {
			String header = "BM";
			System.out.println(header+"-TEST-T="+System.currentTimeMillis());
			Thread.sleep(6000l);
			System.out.println(header+"-hello world!");
		} catch (Exception e) {
		}
		
	}
}
