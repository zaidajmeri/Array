package Array;

public class evenFrequencyArr {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 5, 6, 6, 8, 9 };
		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			} else if (arr[i] % 2 != 0) {
				continue;
			}

			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " = " + count);
		}
	}
}
