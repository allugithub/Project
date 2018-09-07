package Interviewqns;

public class ExceptionTest {

	public static String m1() {
		try {
			return "A";
		}catch(Exception e) {
			return "B";
		}finally {
			return "C";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(m1());
	}

}
