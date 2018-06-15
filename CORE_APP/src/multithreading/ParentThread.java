package multithreading;

public class ParentThread extends Thread {
	int x;
	public ParentThread(){
		x=5;
	}
	public ParentThread(int x){
		this.x=x;
	}
	public void run(){
		for(int i=0;i<this.x;i++){
			System.out.println(getName()+" : "+x);
		}
	}
}
