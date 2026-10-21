package Array;

public class secondSmallest {
	public static void main(String[] args) {
		int[] arr = { 12, 3, 43, 235, 5, 6 };
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
		if (secondSmallest == Integer.MAX_VALUE) {
			System.out.println("No Second Smallest Exist");
		} else {
			System.out.println(secondSmallest + " Is Second Smallest");
		}
	}
}
