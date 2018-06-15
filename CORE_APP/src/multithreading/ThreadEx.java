package multithreading;

public class ThreadEx extends Thread{
	public void run()
	{
		for(int i=1; i<=5;i++){
			System.out.println(getName()+" run "+i);
		}
	}
	public static void main(String[] args) {
		ThreadEx t1=new ThreadEx();
		t1.start();
		ThreadEx t2=new ThreadEx();
		t2.start();
	}

}
