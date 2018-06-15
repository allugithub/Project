package multithreading;

class Test{
	public static void main(String[] args) {
		ParentThread p=new ParentThread();
		p.start();
		for(int i=50;i<=55;i++){
			System.out.println(i);
		}
		ParentThread p1=new ParentThread(10);
		p1.start();
	}
}
