package Interviewqns;

import java.util.Map;
import java.util.TreeMap;

public class SortingArrayWithoutSortMethod {

	public static void sortM(int ar[]) {
		
		Map<Integer,String> map=new TreeMap<>();
		for(int i=0;i<ar.length;i++) {
			map.put(ar[i], "test");			
		}
		System.out.println(map.keySet());
		
	}
	public static void main(String[] args) {
		int ar[]=new int[] {5,3,7,9,1,5,4};
		sortM(ar);

	}

}
