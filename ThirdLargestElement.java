package Array;

public class ThirdLargestElement {
	public static void main(String[] args) {
		int[] arr = { 12, 36, 332, 3, 2, 5 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > thirdLargest && arr[i] != largest && arr[i] != secondLargest) {
				thirdLargest = arr[i];
			}
		}

		if (thirdLargest == Integer.MIN_VALUE) {
			System.out.println("No Third Largest Exist");
		} else {
			System.out.println(thirdLargest + " is third largest");
		}
	}
}
