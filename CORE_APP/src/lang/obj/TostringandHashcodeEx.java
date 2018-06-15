package lang.obj;

import java.util.Scanner;

public class TostringandHashcodeEx {
	static int  x;
	static {
	System.out.println("enter the hashcode no");
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	
	
}
	
	public int userhashCode(){
		System.out.println("object class hashcode is :"+super.hashCode());
		return x;
	}
	//1442407170
	public String toString(){
		return getClass().getName()+"@"+userhashCode();
	}
	public static String orghasCode(int x){
		return Integer.toHexString(x);
	}
	
	public static void main(String[] args) {
		TostringandHashcodeEx t=new TostringandHashcodeEx();
		
		System.out.println(t.toString());
		

	}

}
