package multithreading;

public class ThreadEx1 extends Thread {
	public void run(){
		//System.out.println("from run mehthod");
		for(int i=1; i<=5;i++){
			System.out.println("from run() : "+i);
		}
	}

	public static void main(String[] args) {
		m1();
		
		for(int i=10; i<=15;i++){
			System.out.println("from maain() : "+i);
		}
		ThreadEx1 e=new ThreadEx1();
		e.start();
	}
	public static void m1(){
		ThreadEx1 e=new ThreadEx1();
		//System.out.println("from m1() mehtod");
		e.start();
		for(int i=15; i<=20;i++){
			System.out.println("from m1() : "+i);			
		}
	}
}
