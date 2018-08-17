
public class StringMethodDemo {
	
	public static char[] ch(String str) {
		char res[]=new char[str.length()];
//		System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(str, 0, res, 0, str.length());
		return res;
	}

	public static void main(String[] args) {
		System.out.println(ch("123"));
		/*double d=21.5;
		String s="12".valueOf(d);
		System.out.println(s);
*/
	}

}
