package staticcontrollflow;

public class pro2 {
	//static int x=m2();
	static pro2 p=new pro2();
	/*static{
		System.out.println("from static block");
		System.exit(0);
	}*/
	/*static int m2(){
		System.out.println("from static mehtod m2");
		System.exit(0);
		return 10;
	}*/
	{
		System.out.println("this is not static block");
	}
	public static void main(String a[]){
		System.out.println("from maoin");
		
		
	}

}
