package multithreading;

public class JoinThread1 extends Thread{

	int sum;
	public void run() {
		System.out.println("start of thread1...");
		for(int i=1;i<10;i++) {
			sum=sum+i;
			System.out.println("from JoinThread run() : "+ i);
		}
	}
	
}
