package oops;

public class ObjectCreation {
	static int i;
	static ObjectCreation obj=new ObjectCreation();
	private ObjectCreation() {
		System.out.println("object is created"+ ++i);
	}
	public static ObjectCreation getInstance() {
		if(obj==null)
		return new ObjectCreation();
		else return obj;
	}
	
}
