package Array;

public class frequencyArr {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 5, 4, 4, 6, 6, 9, 9, 10, 10, 10 };
		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
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
