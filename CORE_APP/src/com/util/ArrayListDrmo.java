package com.util;

import java.util.*;

class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("anu");
		al.add("Sravya");
		al.add("ratan");
		al.add("natraj");
		Enumeration<String> e = Collections.enumeration(al);
		while (e.hasMoreElements()) {
			String str = e.nextElement();
			System.out.println(str);
		}
	}
}