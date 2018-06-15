//Application to create user defined thread
package multithreading;

public class MyThread extends Thread {
	static long ft;
	public void run(){
		long stime=new java.util.Date().getTime();
		System.out.println("from run method of runnable interface ");
		for(int i=1; i<=5;i++){
			System.out.println("from run() : "+i);
		}
		
		long etime=new java.util.Date().getTime();
		System.out.println("time take to execut in run:  " + (etime-stime));
	}
	public static void main(String[] args) throws InterruptedException {
		MyThread t1,t2;
		long stime=new java.util.Date().getTime();
		t1=new MyThread();
			
		t2=new MyThread();
		t1.start();//t1.start(); leads IllegalThreadStateException
		for(int i=10; i<=15;i++){
			System.out.println("from main() : "+i);
		}
		Thread.sleep(999);
		t2.run();
		long etime=new java.util.Date().getTime();
		System.out.println("time take to execut in main:  " + (etime-stime));
	}
	

}
