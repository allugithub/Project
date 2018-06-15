package oops;

public abstract class AbstractExp {

	public AbstractExp() {
	System.out.println("from cons");
	}
//	public abstract void test();
	 int m() {
		return 5;
	}
	public static void main(String[] args) {
	
		AbstractExp a=new AbstractExp() {
			
			/*@Override
			public void test() {
				System.out.println("from test");
				*/
			
			
		};
		//a.test();
		System.out.println(a.m());

	}

}
