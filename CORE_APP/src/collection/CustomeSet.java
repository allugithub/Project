package collection;

import java.util.Set;
import java.util.TreeSet;

public class CustomeSet  {
	public static void main(String[] args) {
		Emp e1=new Emp(101, 10, "john", 12000.0);
		Emp e2=new Emp(104, 10, "saiman", 15000.0);
		Emp e3=new Emp(103, 15, "samson", 10000.0);
		Emp e4=new Emp(102, 16, "Rehaan", 12000.0);
		Set set=new TreeSet<>(new Mycomparator());
		set.add(e1);set.add(e2);set.add(e3);set.add(e4);
		
		System.out.println(set);
	}
	

}
