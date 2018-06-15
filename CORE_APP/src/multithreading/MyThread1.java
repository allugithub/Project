package multithreading;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("frm run method");
	}
	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		MyThread t2=new MyThread();
		Thread t1=new Thread(t);
		System.out.println("from main");
		t1.start();
		System.out.println("after t1");
		t2.start();
		t.run();
		System.out.println("after t2");
		
		
		
	}
}
