package set1;

public class Quiz7 {

	public static void main(String[] args) {
		// What if I change the size of the matrix here? Would the code work?
		int[][] matrix = new int[3][3];
		setFromStart(matrix, 1, 1);
		printMatrix(matrix);
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