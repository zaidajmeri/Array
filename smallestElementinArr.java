package Array;

public class smallestElementinArr {
	public static void main(String[] args) {
		int[] arr = { 12, 3, 34, 5, 42, 354 };
		int min = arr[0];

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " is smallest element");
	}
}
