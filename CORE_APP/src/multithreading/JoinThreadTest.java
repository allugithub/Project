package multithreading;

public class JoinThreadTest {

	public static void main(String[] args) {

		JoinThread1 t1=new JoinThread1();
		JoinThread2 t2=new JoinThread2();
		JoinThread3 t3=new JoinThread3(t1);

		t1.start();
		//t2.start();
		t3.start();
	}

}
