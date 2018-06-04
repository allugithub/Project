import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
		String[] s= {"one","two","four","one"};
		HashSet <String> set=new HashSet();
		for (String string : s) {
			if(!set.add(string))
			System.out.println(string);
		}
		System.out.println(set);
	}

}
