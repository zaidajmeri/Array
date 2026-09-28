package Array;

public class removeDuplicateArr {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 20, 30 };
		int[] unique = new int[arr.length];
		int uniqueCount = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}

			if (!duplicate) {
				unique[uniqueCount] = arr[i];
				uniqueCount++;
			}
		}
		for (int i = 0; i < uniqueCount; i++) {
			System.out.println("Unique Elements: " + unique[i]);
		}
	}
}
