package Interviewqns;

import java.util.LinkedHashSet;
import java.util.Set;

public class PossibleStringFormation2 {
	
	public static void op(String s) {
		char ch[]=s.toCharArray();
		Set set=new LinkedHashSet<>();
		for (char c : ch) {
			set.add(c);
		}
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			
			
		}
		System.out.println(set);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		op("abc");

	}

}
