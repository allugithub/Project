import java.util.Arrays;


//commited from Git
//let see the reflectiion in Git
public class Angram {

	public static boolean angramOrNOt(String s1, String s2) {
		char[] c1=s1.replaceAll(" ", "").toLowerCase().toCharArray();
		char[] c2=s2.replaceAll(" ", "").toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
	public static void main(String[] args) {
		System.out.println(angramOrNOt("sachin", "Sacnhi"));

	}

}
