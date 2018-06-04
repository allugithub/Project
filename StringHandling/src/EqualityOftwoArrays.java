import java.util.Arrays;

public class EqualityOftwoArrays {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6};
		int [] b= {2,3,4,5,6};
		
		/*boolean eq=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i])
					eq=true;
				else
					eq=false;
			}
		}else
		{
			eq=false;
		}
		if(eq) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}*/
		System.out.println(Arrays.equals(a, b));
		
		}

}
