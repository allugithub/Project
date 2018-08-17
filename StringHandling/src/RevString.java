
public class RevString {

	public static String revString(String str) {
		/*StringBuffer sb=new StringBuffer(str);
	return	sb.reverse().toString();
	*/
		String rev="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			rev=rev+ch[ch.length-(i+1)];
		}
		
		return rev;
	
	}
	public static void main(String[] args) {
		System.out.println(revString("123456789"));
		String s=new String("sandeep");
		String s1 ="sandeep123";
		 s1=s.intern();
		 s1=s;
		System.out.println(s);
		System.out.println(s1);

	}

}
