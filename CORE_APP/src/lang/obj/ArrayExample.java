package lang.obj;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]= new int[100];
		//Integer i[]=new Integer(100);
		System.out.println(a.length);
		System.out.println(a[65]);
		boolean[] b=new boolean[100];
		System.out.println("b:: "+b[9]);
		System.out.println(a.getClass().getSuperclass().getName());
	}

}
