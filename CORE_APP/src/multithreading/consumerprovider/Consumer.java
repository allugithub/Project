package multithreading.consumerprovider;

public class Consumer extends Thread {
	
	Common c;
	public Consumer(Common c) {
		this.c=c;
	}
	public void run() {
		while(true) {
			int i=c.consume();
			System.out.println("from consumer : "+i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {}
		}
	}

}
