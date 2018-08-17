
public class LokaPro {
	static int t=0;
	public static void test(int ar[], int n) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[i]+ar[j]==n)
					System.out.println(ar[i]+" "+ar[j]);
			}
		}
		
		
		
	}
	/*public static void compareSumOfTwoNumInArrayWithGivenNum(int[] arr,int target) {

	for(int i=0,j=0;j<arr.length;i++) {
		
		
		if((arr[i]+arr[j])==target) {
			System.out.println(arr[i]+"-------"+arr[j]+"="+target);
			//break;
		}else if(i==arr.length-1){
			i=0;
			j++;
		}
	}//for loop
	
}*/
public static void compareSumOfTwoNumInArrayWithGivenNum(int[] arr,int target) {
		
		for(int i=0,j=0;(i<arr.length&&j<arr.length);i++) {
			
		//	System.out.println(arr[i]);
			if(i!=j) {
			if((arr[i]+arr[j])==target) {
				System.out.println(arr[i]+"-------"+arr[j]+"="+target);
				//break;
			}
			}
			else {
				System.out.println("no elesemen");
				
			}
			if(i==arr.length-1){
			//	System.out.println("control inside the else if");
				i=0;
				j++;
			}
			
		}//for loop
		
	}


	public static void main(String[] args) {
		int a[]={10,1,3,14,7,9};
		//test(a,17);
		compareSumOfTwoNumInArrayWithGivenNum(a, 18);

	}

}
