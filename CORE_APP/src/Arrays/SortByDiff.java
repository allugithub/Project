/*
Sort an array according to absolute difference with given value

Examples :

Input : arr[] : x = 7, arr[] = {10, 5, 3, 9, 2}
Output : arr[] = {5, 9, 10, 3, 2}
Explanation:
7 - 10 = 3(abs)
7 - 5 = 2
7 - 3 = 4 
7 - 9 = 2(abs)
7 - 2 = 5
So according to the difference with X, 
elements are arranged as 5, 9, 10, 3, 2.

*/
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByDiff {
	
	
	public static void  getOp(int ar[], int n) {
		//Arrays.sort(ar);
		List l=new ArrayList();
		List l2=new ArrayList();
		for (int i : ar) {
			l.add(Math.abs(n-i));
			l2.add(i);
		}
		System.out.println(l);
		System.out.println(l2);
	}

	public static void main(String[] args) {
		//int a[]=new int[] {5,9,10,3,2};
		int a[]=new int[] {2, 6, 8, 3} ;
		getOp(a, 5);

	}

}
