package Concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ConCurrentException {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		Collections.synchronizedList(al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.println(i);
			al.add(5);//concurrentmodificationexception
		}

	}

}
