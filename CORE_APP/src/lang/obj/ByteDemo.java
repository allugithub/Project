package lang.obj;

public class ByteDemo {

	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.BYTES);
		System.out.println(Byte.TYPE);
		
		Byte b=new Byte((byte) 1000);
		System.out.println(b.MAX_VALUE);
		
		//byte b=10;
		char ch=477;
		System.out.println("\"hi\"");
		double d=1_23_5.4;
		System.out.println(d);

	}

}
