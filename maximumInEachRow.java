package Array2D;

public class maximumInEachRow {

	public static void main(String[] args) {
		int[][] arr = { { 99, 100, 2 },
						{ 25, 65, 9 },
						{ 13, 32, 75 } 
					};
		

		for (int i = 0; i < arr.length; i++) {
			int maxValue = Integer.MIN_VALUE;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > maxValue) {
					maxValue = arr[i][j];
				}
			}
			System.out.println("row " + i + " Max : " + maxValue);
		}
	}
}
