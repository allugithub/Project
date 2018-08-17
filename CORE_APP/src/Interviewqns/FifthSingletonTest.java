package Interviewqns;

public class FifthSingletonTest extends Thread {
	public void run() {
		FifthSingleton f=	FifthSingleton.getInstance();
		System.out.println("from run method : "+f.hashCode());
	
	}
	static{
		FifthSingleton f=	FifthSingleton.getInstance();
		System.out.println("from static block 1 : "+f.hashCode());
	
	}
	{
		FifthSingleton f=	FifthSingleton.getInstance();
		System.out.println("from non static blcok 1 : "+f.hashCode());
	
	}
	public static void main(String[] args) {
		FifthSingletonTest fif=new FifthSingletonTest();
	FifthSingleton f=	FifthSingleton.getInstance();
		System.out.println("from main : "+f.hashCode());
		fif.getObj();
		fif.start();
	}

	private void getObj() {
		FifthSingleton f=	FifthSingleton.getInstance();
		System.out.println("from get method : "+f.hashCode());
			
	}
	static{
	FifthSingleton f=	FifthSingleton.getInstance();
		System.out.println("from static block 2 : "+f.hashCode());
	}
	{
		FifthSingleton f=	FifthSingleton.getInstance();
		System.out.println("from non static block 2 : "+f.hashCode());
	
	}

}
