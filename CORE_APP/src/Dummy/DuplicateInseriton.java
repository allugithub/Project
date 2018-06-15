package Dummy;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateInseriton {
	

	public static void main(String[] args) {
		try{
		Student s=new Student(101,"Rehaan");
		Student s1=new Student(101,"AR");
		HashSet<Object> hs=new HashSet<>();
		//Hashtable<rno, name> hs=new Hashtable<>();
		System.out.println(s.hashCode()+",.,.,."+s1.hashCode());
		hs.add(s);
		boolean result=hs.add(s1);
		System.out.println(hs);
		System.out.println(result);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
