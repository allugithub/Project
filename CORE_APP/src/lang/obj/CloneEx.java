package lang.obj;

public class CloneEx  implements Cloneable{
	int i=10, j=20;
	int a=5, b=2;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneEx c1=new CloneEx();
		CloneEx c2=c1; //this is duplicate copy(just c2 pointin to c1 object) but not cloning
		c2.i=40;
		c2.j=50;
		System.out.println(c1.i+"  : "+c1.j);
		CloneEx c3=(CloneEx)c1.clone();
		c3.a=150;c3.b=600;
		System.out.println(c3.a+" : "+c3.b+" : "+c3.i+" : "+c3.j);
		System.out.println(c2.i+"  : "+c2.j+"   "+c2.a+"  : "+c2.b);
		
	}

}
