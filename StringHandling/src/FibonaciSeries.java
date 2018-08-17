
public class FibonaciSeries {
	static int n1=0,n2=1,n3;
	public  static void fibonaci(int n) {
		if(n>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
		fibonaci(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(n1);
		System.out.println(n2);
		fibonaci(10);

		
	}

}
