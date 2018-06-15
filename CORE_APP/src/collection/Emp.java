package collection;

import java.util.Comparator;

public class Emp {
	private int empid,deptno;
	private String name;
	private double sal;
	//this is normal sorting mechanism (class must have to implement from Comparable
	/*@Override
	public int compareTo(Object o) {
		Emp emp=(Emp)o;
		return this.empid-emp.getEmpid();
	}*/
	
	
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", deptno=" + deptno + ", name=" + name + ", sal=" + sal + "]";
	}
	public Emp(int empid, int deptno, String name, double sal) {
		super();
		this.empid = empid;
		this.deptno = deptno;
		this.name = name;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setDal(double sal) {
		this.sal = sal;
	}
	
	
	

}
