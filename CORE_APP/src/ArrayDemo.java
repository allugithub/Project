
public class ArrayDemo {

	public static int[] arrResult(int[] a, int n){
		int temp[]=new int[a.length];
		int p=-1;
		for(int i=0;i<a.length;i++){
			if((i+n)>a.length-1){
				p=Math.abs(a.length-i-n);
			}else{
				p=i+n;
			}
			temp[p]=a[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int op[]=arrResult(arr, 4);
		System.out.println(Math.abs(arr.length-15));
		for(int i=0;i<=op.length-1;i++){
		System.out.println(op[i]);
		}

	}

}
