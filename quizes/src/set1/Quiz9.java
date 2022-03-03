package set1;

public class Quiz9 {

	public static void main(String[] args) {
		int rows = 5;
		String[][] matrix = new String[rows][];
		
		for (int i = 0; i < rows; i++) {
			String[] list = new String[i + 1];
			for (int j = 0; j < i + 1; j++) {
				list[j] = "Number: " + j;
			}
			matrix[i] = list;
		}
		printMatrix(matrix);
		
		System.out.println();
		// System.out.println(matrix[0][1]);
		// System.out.println(matrix[3][1]);
		// System.out.println(matrix[4][4]);
		System.out.println(matrix[5][5]);
	}
	
	static void printMatrix(String[][] matrix) {
		for (String[] row : matrix) {
			for (String e: row) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
}
