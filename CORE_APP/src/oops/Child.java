package oops;

import java.util.Scanner;

public class Child extends Parent {

	void m2() {
		System.out.println("from child clas");
	}
	public static void main(String[] args) {
		Parent p=new Child();
		Scanner sc=new Scanner(System.in);
		p.m2();
		//p.m1();
	}
}
 