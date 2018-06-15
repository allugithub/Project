package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilCollection {

	public static void main(String[] args) {
		
		List l=Arrays.asList("rehaan",20,'c',25.2);
		Collections.fill(l, 0);
		System.out.println(l);
		
		List al= Arrays.asList(450,35,684,465);
		System.out.println(Collections.max(al));
		
	}

}
