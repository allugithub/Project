package com.util;

import java.util.Arrays;
import java.util.List;

public class ArrayasList {

	public static void main(String[] args) {
		List al=Arrays.asList("abc","xyz","123",123,'c');
		System.out.println(al);
		
		long[]b= {1,2,3,4};
		System.out.println(Arrays.binarySearch(b, 2));
		Arrays.sort(b);
		System.out.println(b);
	}

}
