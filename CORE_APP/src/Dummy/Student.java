package Dummy;

public class Student {
	private int rno;
	private String name;
	public Student(int rno,String name){
				this.rno=rno;
				this.name=name;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object o){	
	Student st=(Student)o;
	System.out.println("testing"+st.hashCode()+"this"+this.hashCode());
	if(st.rno==this.rno)
   return true;
    else
	return false;
	}
	
	@Override
	public int hashCode() {
		return this.rno;
	}

}
