import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharRemove {

	public static String uniqueString(String s) {

		char ch[] = s.toCharArray();
		Set set = new LinkedHashSet();
		for (char c : ch) {
			set.add(c);
		}
		String op = "";
		Iterator itr = set.iterator();
		while (itr.hasNext()) {

			op = op + itr.next();
		}
		return op;//removes all duplicate char
		//return op.replace(" ", "");// removes duplicate along with space
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(uniqueString("Hello i am sandeep"));
	}

}
