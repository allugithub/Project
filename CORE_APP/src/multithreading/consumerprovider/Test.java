package multithreading.consumerprovider;

public class Test {

	public static void main(String[] args) {
		Common c=new Common();
		
		Producer pod=new Producer(c);
		Consumer con=new Consumer(c);
		pod.start();
		con.start();

	}

}
