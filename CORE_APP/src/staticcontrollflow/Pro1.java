package staticcontrollflow;

public class Pro1 {
	static int i=10;
	static {
		m1();
		System.out.println("from staic block 1");
		
	}
	static int m2(){
		System.out.println("from m2");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("this is main ");
		m2();
		System.out.println("from MAIN value of k"+ k );
	}
	static void m1(){
		System.out.println("from m1");
		System.out.println("from static value of k"+ k );
	}
	static{
		System.out.println("from staic block 2");
		//System.out.println("from staic block 2"+ j );
		
	}
	static int k=30;
	static int j=m2();

}
