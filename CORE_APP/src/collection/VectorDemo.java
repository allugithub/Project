package collection;

import java.util.Random;
import java.util.Vector;

public class VectorDemo {

	public static void main(String ar[]){
		Vector v=new Vector();
		System.out.println("initial : "+v.size());
		System.out.println("initial :"+v.capacity());
		for(int i=0;i<=15;i++){
			v.add(new Random().nextInt(100));
		}
		System.out.println(v);
		System.out.println("after :"+v.size());
		System.out.println("after :"+v.capacity());
		
	}
}
