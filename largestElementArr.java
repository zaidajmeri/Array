package Array;

public class largestElementArr {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 54, 5, 76, 64 };
		int max = arr[0]; // 12

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element in array is : " + max);
	}
}
