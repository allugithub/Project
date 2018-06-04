
public class RevString {

	public static String revString(String str) {
		StringBuffer sb=new StringBuffer(str);
	return	sb.reverse().toString();
	}
	public static void main(String[] args) {
		System.out.println(revString("hey h r u"));

	}

}
