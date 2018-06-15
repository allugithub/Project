package com.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {

	public static void main(String[] args) {
		Map <Integer, String> map=new LinkedHashMap();
		map.put(101, "apple");
		map.put(102, "asus");
		map.put(103, "vivo");
		map.put(104, "appo");
		map.put(105, "samsung");
		System.out.println(map);
		Set keySet=map.keySet();
		System.out.println(keySet);
		Object values=map.values();
		System.out.println(values);
		Set entrySet=map.entrySet();
		System.out.println(entrySet);
		System.out.println(map.containsKey(122));
		System.out.println(map.containsValue("apple"));
	}

}
