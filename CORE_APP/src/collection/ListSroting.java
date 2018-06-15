package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSroting {
	

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(100);
		list.add(50);
		list.add(75);
		list.add(45);
		System.out.println(list);
		//Collectioin.sort(list);//natural sorting 
		Collections.sort(list, new MyCompartor());//customize sorting
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
class MyCompartor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i=(Integer)o1;
		Integer j=(Integer)o2;
				
		return -i.compareTo(j);
	}
	
}
