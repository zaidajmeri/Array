package Array;

public class SearchArr {
	public static void main(String[] args) {
		int[] arr = { 11, 5, 434, 34, 234, 23 };
		int target = 23;
		int foundIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				foundIndex = i;
				break;
			}
		}
		if (foundIndex != -1) {
			System.out.println("The Target is on " + foundIndex + "th Index");
		} else {
			System.out.println("Not Found");
		}
	}
}
