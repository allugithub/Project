
public class RemoveWhiteSpace {

	public static String removeSpace(String str) {
		char[] c=str.toCharArray();
		int count=0;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			if(c[i]!=32)
				sb.append(c[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(removeSpace("hi this is ram"));

		//using replaceall()
		System.out.println("hi this   is ram    ".replaceAll(" ", ""));
	}

}
