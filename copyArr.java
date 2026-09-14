package Array;

public class copyArr {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4 };
		int[] copy = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];

		}

		System.out.print("Original Array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("Duplicate Array ");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}
}
