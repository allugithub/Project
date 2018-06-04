
public class RemoveAllVowelsFromString {

	public static String removeVow(String str) {
		String vowlessString=str.toLowerCase().replaceAll("[ aeiou]", "");
		return vowlessString;
	}
	public static void main(String[] args) {
		System.out.println(removeVow("i am a good boy"));

	}

}
