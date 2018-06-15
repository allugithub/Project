package com.util;

import java.util.HashMap;
import java.util.Map;

public class HashMapkey {

	private int id;
	public int hashCode() {
		System.out.println("from hashcode ...");
		return id;
	}
	public void setId(int id ) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public HashMapkey(int id) {
		super();
		this.id = id;
	}
	public static void main(String ar[]) {
		HashMapkey key=new HashMapkey(5);
		Map<HashMapkey, String> map=new HashMap();
		map.put(key, "ram");
		
		
	}
	
}
