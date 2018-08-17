import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNoInArray {

	public static int largestNo(Integer arr[]) {
		/*List<Integer> list=Arrays.asList(arr);
		Collections.sort(list);*/
		Arrays.sort(arr);
	//	return list.get(list.size()-2);
		return arr[arr.length-2];
	}
	public static void main(String[] args) {
		Integer arr[]= {25,35,45,65,21,46};
		System.out.println(largestNo(arr));
	}

}
