import java.util.Arrays;
import java.util.HashSet;

public class CommonEllementBetweenTwoArray {

	public static void main(String[] args) {

		String[] s1= {"one","two","three","four","one"};
		String[] s2= {"one","two","four","five"};
      
	/*	HashSet<String> hs=new HashSet<>();
       for(int i=0;i<s1.length;i++) {
    	   for(int j=0;j<s2.length;j++) {
    		   if(s1[i].equals(s2[j])) {
    			   hs.add(s1[i]);
    		   }
    	   }
       }
       System.out.println("The Duplicate Element is "+hs);*/
	
		HashSet<String> h1=new HashSet<>(Arrays.asList(s1));
		System.out.println(h1);
		HashSet<String> h2=new HashSet<>(Arrays.asList(s2));
		h1.retainAll(h2);
		System.out.println(h1);
	}

}
