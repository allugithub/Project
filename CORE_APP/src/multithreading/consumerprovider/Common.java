package multithreading.consumerprovider;

public class Common {

	static int v;
	boolean flag=true;
	
	public synchronized void produce(int i) {
		if(flag==true) {
			v=i;
			System.out.println("from produce : "+v);
			flag=false;
			notify();
		}
		try {
			wait();
		}catch(Exception e) {
			
		}
		
	}
	
	public synchronized int consume() {
		if(flag==true) {
			try {
				wait();
			}catch(Exception e) {}
		}
		flag=true;
		notify();
		return v;
	}
	
}
