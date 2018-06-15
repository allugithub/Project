package collection;

import java.util.Comparator;

public class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		return (int) (e1.getSal()-e2.getSal());
	}

	

}
