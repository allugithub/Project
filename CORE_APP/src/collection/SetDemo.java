package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set hs=new TreeSet();
		hs.add(101);
		hs.add("Ram");
		hs.add(11000.0);
		hs.add(321);
		hs.add("mix");
		System.out.println(hs);
	}

}
