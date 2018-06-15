package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListDemo {

	public static void main(String[] args) throws InterruptedException {
		ArrayList al=new ArrayList<>();
		for(int i=0;i<10;i++){
			
			al.add(new Random().nextInt(5000));
			
		}
		System.out.println(al.spliterator());
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			Thread.sleep(600);
			//al.add(45); RE: Concurentmodificationexception
		}
	}

}
