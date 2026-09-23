package Array;

public class MaximumElement {
	public static void main(String[] args) {
		int[] arr = { 2, 22, 254, -2, 42 };

		int res = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > res) {
				res = arr[i];
			}
		}
		System.out.println(res + " is Maximum Element in array");
	}
}
