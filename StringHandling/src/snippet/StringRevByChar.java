package snippet;

public class StringRevByChar {
	
	public static String revByChar(String str) {
		StringBuffer result=new StringBuffer();
		String s[]=str.split(" ");
		for (String string : s) {
			result=result.append(new StringBuffer(string).reverse()).append(" ");
		}
		
		
		return result.toString();
	}
	
	public static String revByWord(String str) {
		String s[]=str.split(" ");
		String result="";
		for(int i=s.length-1;i>=0;i--) {
			result=result+s[i]+" ";
		}
		return result;
	}
	

	public static void main(String[] args) {
		System.out.println(revByChar("My name is Khan"));
		System.out.println(revByWord("My name is  King Khan"));
	}

}
