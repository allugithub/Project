package collection;

import java.util.Arrays;
import java.util.List;

public class ToConvertArrayIntoList {

	
	public static void main(String[] args) {
		String[] s= {"ram","gopal","venky"};
		System.out.println(s.toString());
		for (String string : s) {
			System.out.println(string);
		}
		List l=Arrays.asList(s);
		System.out.println(l);
	}

}
