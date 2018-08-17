
public class LongestWordInaString {

	public static void findString(String str) {
		String word[]=str.split(" ");
		String big=word[0];
		for(int i=0;i<word.length;i++) {
			if(word[i].length() > big.length()) {
				big=word[i];
			}
			
		}
		System.out.println(big);
	}
	public static void main(String[] args) {

		findString("hi how are you are today");

	}

}
