package Interviewqns;

public class FifthSingleton {
	private static int count;
	private static FifthSingleton fif=new FifthSingleton();
	private FifthSingleton() {
		count++;
		System.out.println(this.hashCode());
		
	}
	public static FifthSingleton getInstance() {
		//count++;
		System.out.println(count);
		if(count>=5) {
			return fif;
		}
		else {
			return new FifthSingleton();
		}
	}

}
