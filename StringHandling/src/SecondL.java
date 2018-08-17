
public class SecondL {

	public static int find2ndLargestNumber(int[] arr) {

		int firstLarge = 0;
		int secondLarge = 0;

		for (int i = 0; i < arr.length; i++) {

			if (firstLarge < arr[i]) {
				secondLarge = firstLarge;
				firstLarge = arr[i];
			}
		//	System.out.println(firstLarge + "   " + secondLarge);
		}
		return secondLarge;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 77, 43, 45, 78, 99 };

		System.out.println("The second largest number is "+find2ndLargestNumber(arr));

	}

}
