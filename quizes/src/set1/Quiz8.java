package set1;

public class Quiz8 {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		setFromStart(matrix, 1, 1);
		printMatrix(matrix);
		
		System.out.println();
		// System.out.println(matrix[0][1]);
		// System.out.println(matrix[3][1]);
		// System.out.println(matrix[2][1]);
		System.out.println(matrix[2][2]);
	}
	
	// Why don't we need the size of the array in the parameter list?
	static void setFromStart(int[][] matrix, int start, int interval) {
		int val = start;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = val;
				val += interval;
			}
		}
	}
	
	static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int e: row) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

}
