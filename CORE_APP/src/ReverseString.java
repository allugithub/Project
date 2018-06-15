
public class ReverseString {

	public static String reverseString(String str) {
	String revString="";
	for(int i=1;i<=str.length();i++) {
		revString=revString+(str.charAt(str.length()-i));
	}
		return revString;
	}
	
	public static boolean isContainsUniqueCars(String str) {
		boolean isUnique=false;
		//unique char logic goes here.
		for(int i=1;i>=0&&i<str.length();i++) {
			int temp=i-1;
			while(temp>=0) {
				if(str.charAt(i)==str.charAt(temp)) {
					/*System.out.println("-------------------");
					System.out.println(str.charAt(temp));
					System.out.println(str.charAt(i));*/
					return isUnique;
				}
				temp--;
			}//while
		}//for
		
		isUnique=true;
		
		return isUnique;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Rehaan"));
		
		System.out.println("Is unique ::"+isContainsUniqueCars("Rahen"));
		System.out.println(spaceReplace("this is a sample msg for test"));
}
	public static String spaceReplace(String str) {
		String resultString="";
				return str.replaceAll(" ", "%20");
		
		
		
	}

}
