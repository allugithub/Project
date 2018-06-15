import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class CommonElement {

	public static void main(String[] args) {
		
			ArrayList<Integer> a=new ArrayList();
			for(int i=0;i<5;i++){
				a.add(i);
			}
			
			ArrayList<Integer> b=new ArrayList();
			for(int i=3;i<7;i++){
				b.add(i);
			}
			//System.out.println(a.retainAll(b));
			//ArrayList<Integer> c=new ArrayList(a);
			ArrayList<Integer> c=(ArrayList<Integer>)a.clone();
			//c.clear();
		//	System.out.println(c);
			c.retainAll(b);//b
			System.out.println(a);
			/*System.out.println(b);
			System.out.println(c);
			
			System.out.println(b.removeAll(c)+" ...  "+b);
			
			System.out.println(a);
*/			
			ListIterator<Integer> itr=a.listIterator(21);
			System.out.println(itr.toString());
			
						while(itr.hasNext()) {
				int temp=itr.next();
				if(temp%2==0) {
					itr.set(temp+10);
				}
				
			}
			a.forEach(eachNum->{
				System.out.println(eachNum);
			});
	

	}
}
