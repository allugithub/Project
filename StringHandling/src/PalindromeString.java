
public class PalindromeString {

	public static boolean isPalindrome(String s) {
		//boolean flag=false;
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
			return true;
			else
		return false;
	}
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("madam"));

	}

}
