
public class NoOfWordsInString {
	public static int noofword(String str) {
		if(str.equals(null)|| str.isEmpty())
		return 0;
		else {
			String[] word=str.trim().split(" ");
		return word.length;
		}
	}

	public static void main(String[] args) {

		System.out.println(noofword("this is hyd"));

	}

}
