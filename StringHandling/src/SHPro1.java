
public class SHPro1 {
	{
		System.out.println("from ..."+getClass().getName());
		System.out.println(Integer.toHexString(hashCode()));
		 
	}
	public static void main(String args[]){
		SHPro1 s=new SHPro1();
		/*String s="arn";
		System.out.println("Stirng is : "+s+s.hashCode());
		s="arn";
		System.out.println("modified string is : "+s+s.hashCode() );*/
		
		char ch[]={'a','b','c'};
		
		System.out.println(ch.toString());
		
		
	}

}
