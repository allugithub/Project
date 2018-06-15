package collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList al,al2;
		al=new ArrayList();
		al2=new ArrayList();
		
		for(int i=1;i<20;i++){
			if(i%3==0)
				al.add(i);
			else
				al2.add(i);
		}
		System.out.println(al);
		System.out.println(al2);
	}

}
