package multithreading;

public class JoinThread2 extends Thread {
	
	public void run() {
		for(int i=20;i<30;i++) {
			System.out.println("from JoinThread run()  :  "+i);
		}
	}

}
