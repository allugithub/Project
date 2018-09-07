
package oops;

public class P1 {

	int i=10;
	static  int b;
	//int i=m1();

	 static int m1() {
		System.out.println("from P1 class");
		return 0;
	}
	static {
		System.out.println("from static blcok of P1");
	}
	public static void main(String[] args) {
	/*	System.out.println("from main of P1");
		System.out.println(new P1().i);
	*/}
	
}
