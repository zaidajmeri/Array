package Array;

public class secondLargestElement {
	public static void main(String[] args) {
		int[] arr = { 12, 3, 43, 235, 5, 6 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {

				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No Second Largest Exist");
		} else {
			System.out.println(secondLargest + " Is Second Largest ");
		}
	}
}
