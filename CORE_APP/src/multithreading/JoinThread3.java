package multithreading;

public class JoinThread3 extends Thread {

	JoinThread1 t1;
	public JoinThread3(JoinThread1 t1) {
		this.t1=t1;
	}
	
	public void run() {
		for(int i=40;i<=50;i++) {
			System.out.println("from JoinTHread of run()  :  "+i);
			if(i==45) {
				try {
					t1.join(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int x=t1.sum - i;
				System.out.println("sum is : "+t1.sum);
				System.out.println("sum is : "+x);
			}
		}
	}
}
