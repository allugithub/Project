package lang.obj;

public class EqualsEx {
	String s;
	EqualsEx (String s){
		this.s=s;
	}

	public static void main(String[] args) {
		String s1=new String("ram");
		String s2=new String("ram");
		System.out.println(s1.equals(s2));
		
		EqualsEx e1=new EqualsEx("ram");
		
		EqualsEx e2=new EqualsEx("ram");
		System.out.println(e1);
		System.out.println(e1.hashCode());
		System.out.println(e1.equals(e1.hashCode()));
	}

}
