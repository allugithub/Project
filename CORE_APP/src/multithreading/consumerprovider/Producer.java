package multithreading.consumerprovider;

public class Producer extends Thread {
	
	Common c;
	public Producer(Common c) {
		this.c=c;
	}
	
	public void run() {
		int i=0;
		while(true) {
			c.produce(i);
			i=i+1;
			
			try {
				Thread.sleep(2000);
			}catch(Exception e) {}
		}
	}

}
