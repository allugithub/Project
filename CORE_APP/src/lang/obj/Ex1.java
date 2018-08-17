package lang.obj;

public class Ex1 {
	int i;
	Ex1(int i){
		this.i=i;
	}
	public int hashCode(){
		return i;
	}

	public static void main(String[] args) {
		Ex1 e=new Ex1(10);
		Ex1 e1=new Ex1(100);
		//System.out.println(e);
		//System.out.println(e1);
		String s="raghunath";
		//System.out.println(s.substring(6,13));
		System.out.println(s.charAt(2));
	}

}
