package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtil {
	public static void main(String[] args) {
		String[] a= {"a","dfa","ram","ramm"};
		String[] a1= {"a1","dfa5","ram2","ra"};
		ArrayList al=new ArrayList<>(Arrays.asList(a));
		ArrayList al2=new ArrayList<>(Arrays.asList(a1));
		System.out.println(Collections.binarySearch(al, "ram"));
		System.out.println(Collections.disjoint(al, al2));
		ArrayList l=new ArrayList();
		Collections.fill(al, "ratan");
		System.out.println(al);
		
		/*int []i= {100,200,300,451,5,56,75};
		l=(ArrayList) Arrays.asList(i);*/
		Collections.reverse(al2);
		System.out.println(al2);
	}

}
