package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtilMethod {

	public static void main(String[] args) {
		String []str=new String[] {"ram","loka","sai"};
		//List list1=Arrays.asList(str);// here not possible to add new element 
		List<String> list1=new ArrayList(Arrays.asList(str));// here possible
		list1.add("5");
		System.out.println(list1);
		
		//==========================================
		List list3=new ArrayList();
		list3.add(5);
		list3.add(8);
		List list2=new ArrayList<>();
		list2.add(3);
		//Collections.copy(list3, list2);
		//System.out.println(Collections.emptyList(list2));
		

	}

}
