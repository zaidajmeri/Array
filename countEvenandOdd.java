package Array;

public class countEvenandOdd {
	public static void main(String[] args) {
		int[] arr = { 7, 28, 9, 21, 29 };
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println(evenCount + " Even Element");
		System.out.println(oddCount + " Odd Element");

	}
}
