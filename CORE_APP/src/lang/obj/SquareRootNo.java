package lang.obj;

public class SquareRootNo {

	//solution
	static int temp=1;
	public static int noOfSquareNo(int a, int b) {
		int c=0;
		int ol=0,il=0;
		for(int i=a;i<=b;i++) {
			ol++;
			for(int j=temp;j<=i;j++) {
				il++;
				if(j*j==i) {
					//System.out.println(i);
					temp=j;
					c++;
				}
			}
		}
		
		System.out.println("ol="+ol);
		System.out.println("il="+il);
		return c;
	}
	
	//optimized code
	 static double countSquares(int a, int b)
	    {
		 System.out.println(Math.floor(Math.sqrt(b)));
		 System.out.println(Math.ceil(Math.sqrt(a)));
	        return (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
	    }
	
	
	public static void main(String[] args) {
		System.out.println(noOfSquareNo(2, 10000000));
		//System.out.println((int)countSquares(2, 10000000));

	}

}
