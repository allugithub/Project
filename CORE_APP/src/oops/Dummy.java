package oops;

public class Dummy {
	static {
		System.out.println("frm stastic");
		//System.exit(0);
	}
	
	public static void main(String[] args) {
		/*Object o=new Object();
		String s=(String)o;*/
		/*String s=new String("raghuanth");
		Object o=s;
		System.out.println(o==s);*/

		/*int age=101;
		if(age>100) {
			throw new InvalidAgeException("Age must not be greater than 100");
		}
		else {
			System.out.println(age);
		}
		*/
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			throw new ArithmeticException();
		}
	}

}
