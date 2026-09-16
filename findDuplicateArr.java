package Array;

public class findDuplicateArr {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 4, 5, 3, 6, 5, 7 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " " + "is duplicate element");
				}
			}
		}
	}
}
