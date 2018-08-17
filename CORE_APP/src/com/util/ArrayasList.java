package com.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class ArrayasList {

	public static void main(String[] args) {
		List al=Arrays.asList("abc","xyz","123",123,'c');
		//System.out.println(al);
		
		Enumeration e=Collections.enumeration(al);
		System.out.println(Collections.binarySearch(al, "123"));
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	
		
/*		long[]b= {1,2,3,4};
		System.out.println(Arrays.binarySearch(b, 2));
		Arrays.sort(b);
		System.out.println(b);
*/	}

}
