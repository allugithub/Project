
public class ProductTest {

	public static void main(String[] args) {
		//Product p=new Product();
		
		Product.accessMethod();
		System.out.println("........ main()......");
		Product.accessMethod();
		try {
			Class.forName("Product");
			System.out.println("object is crea");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
