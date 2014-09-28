import java.io.PrintWriter;


public class Sin {

	public Sin() {
	}
	
	public static void main(String[] args) {
		final PrintWriter pw = new PrintWriter(System.out);
		Thread th =	new Thread(){
			@Override
			public void run() {
				super.run();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("..");
				pw.write("lini那你");
			}
		};
		th.start();
	}

}
