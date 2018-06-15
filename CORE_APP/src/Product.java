//singleton desgin
public class Product {
	private static int objectCount=1;
	private static Product p=null;
	private Product() {
		System.out.println("object created for Product class -->  "+objectCount+" time");
		objectCount++;
	}
	public static Product accessMethod() {
		if(p==null) {
			p=new Product();
			return p;
		}else {
		return p;
		
		}
	}//method
}//class
