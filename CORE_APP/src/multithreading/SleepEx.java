package multithreading;

public class SleepEx extends Thread {

	public void run() {
		
		System.out.println("from run()");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		SleepEx s1=new SleepEx();
		SleepEx s2=new SleepEx();
		s2.start();
		s1.start();
		s1.wait();
		//s1.start();
		System.out.println("from main");

	}

}
