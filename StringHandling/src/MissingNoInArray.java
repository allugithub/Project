
public class MissingNoInArray {

public static int findMissNo(int ar[]) {
	int sum=0,n;
	n=ar.length+1;
	int sumArr=n*(n+1)/2;
	for (int i : ar) {
		sum=sum+i;
	}
	
	
	return sumArr-sum;
}
	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		System.out.println(findMissNo(a));

	}
	

}
