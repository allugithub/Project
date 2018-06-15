package oops;

public class C1 extends P1 {
	
	/*static  int m1(){
		System.out.println("from m1()");
		return 0;
	}
	static {
		
		System.out.println("C1 class is loaded");
	}*/
	C1(){
		super();
		System.out.println(super.i);
		//super.b;
	}
	
	public static void main(String[] args) {
		//System.out.println(m1());
		P1.main(null);
		C1 c=new C1();
		System.out.println(c==null);
		

	}

}
