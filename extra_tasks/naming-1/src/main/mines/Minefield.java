package main.mines;

import java.util.Random;

public class Minefield {
	
	private static final int MINE_MARKER = -1;

	private final int[][] fields;
	private final int cols;
	private final int rows;
	private final int numberOfMines;
	
	public Minefield(int rows, int cols, int numberOfMines) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.numberOfMines = numberOfMines;
		fields = new int[rows][cols];
		generateContent();
	}
	
	public boolean hasMineAt(int row, int col) {
		return fields[row][col] == MINE_MARKER;
	}
	
	public int adjacentMines(int row, int col) {
		return fields[row][col];
	}
	
	private void generateContent() {
		fillMines();
		calcNumbers();
	}
	
	private void fillMines() {
		int[] fieldIndeces = generateUniqueFields(numberOfMines);
		for (int fieldIndex : fieldIndeces) {
			Coord coord = toTwoDimArrayIndeces(fieldIndex);
			fields[coord.row][coord.col] = MINE_MARKER;
		}
	}
	
	private int[] generateUniqueFields(int n) {
		int[] uniqueFields = new int[n];
		Random rnd = new Random();
		for (int i = 0; i < uniqueFields.length; i++) {
			int num;
			do {
				num = rnd.nextInt(rows * cols);
			} while(isNotUnique(uniqueFields, num, i));
			uniqueFields[i] = num;
		}
		return uniqueFields;
	}
	
	private boolean isNotUnique(int[] nums, int newNum, int till) {
		for (int i = 0;  i < till; i++) {
			if (nums[i] == newNum) {
				return true;
			}
		}
		return false;
	}
	
	private Coord toTwoDimArrayIndeces(int index) {
		return new Coord(
				index / cols,
				index % cols
		);
	}
	
	private void calcNumbers() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if (hasMineAt(row, col)) {
					continue;
				}
				fields[row][col] = countSurroundingMines(row, col);
			}
		}
	}
	
	private int countSurroundingMines(int row, int col) {
		int mineCount = 0;
		if (row != 0) {
			mineCount += hasMineAt(row - 1, col) ? 1 : 0; 
		}
		if (row != rows - 1) {
			mineCount += hasMineAt(row + 1, col) ? 1 : 0; 
		}
		if (col != 0) {
			mineCount += hasMineAt(row, col - 1) ? 1 : 0; 
		}
		if (col != cols - 1) {
			mineCount += hasMineAt(row, col + 1) ? 1 : 0; 
		}
		if (row != 0 && col != 0) {
			mineCount += hasMineAt(row - 1, col - 1) ? 1 : 0; 
		}
		if (row != rows - 1 && col != 0) {
			mineCount += hasMineAt(row + 1, col - 1) ? 1 : 0; 
		}
		if (row != 0 && col != cols - 1) {
			mineCount += hasMineAt(row - 1, col + 1)? 1 : 0; 
		}
		if (row != rows - 1 && col != cols - 1) {
			mineCount += hasMineAt(row + 1, col + 1) ? 1 : 0; 
		}
		return mineCount;
	}
	
	public int getCols() {
		return cols;
	}

	public int getRows() {
		return rows;
	}
}
