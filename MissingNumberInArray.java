package Array;

public class MissingNumberInArray {
	public static void missing(int[] arr) {
		int n = arr.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int ActualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			ActualSum = ActualSum + arr[i];
		}

		int missingNum = expectedSum - ActualSum;
		System.out.println(missingNum + " is Missing ");
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		missing(arr);
	}
}
