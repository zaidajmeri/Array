package Array2D;

public class Matrix {
	int rows;
	int cols;

	int[][] data;

	Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		data = new int[rows][cols];
	}

	Matrix() {
		this(3, 3);
	}

	void displayDimention() {
		System.out.println("Matrix Size : " + rows + "x" + cols);
	}

	void set(int r, int c, int val) {
		if (r >= 0 && r < rows && c >= 0 && c < cols) {
			data[r][c] = val;
		} else {
			System.out.println("Index out of bounds");
		}
	}

	int getOverallMax() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] > max) {
					max = data[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		Matrix m2 = new Matrix(4, 6);

		m1.displayDimention();
		m2.displayDimention();

		System.out.println("================================");

		m2.set(3, 3, 6);

		System.out.println(m2.getOverallMax());
	}
}
