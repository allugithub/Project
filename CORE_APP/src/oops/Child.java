package oops;

public class Child extends Parent {

	void m2() {
		System.out.println("from child clas");
	}
	public static void main(String[] args) {
		Parent p=new Child();
		//p.m2();
		p.m1();
	}
}
