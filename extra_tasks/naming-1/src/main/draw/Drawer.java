package main.draw;

import main.mines.Minefield;

public class Drawer {
	
	private static final int MAX_NUMBER_LENGTH = 3;
	private static final char MINE_MARKER_CHAR = 'x';
	
	public void drawMineField(Minefield field) {
		System.out.println();
		for (int i = 0; i < field.getRows(); i++) {
			int numLen = getNumDisplayLength(i);
			String spaces = getNSpaces(MAX_NUMBER_LENGTH - numLen + 1);
			System.out.print(i + spaces + ":: ");
			for (int j = 0; j < field.getCols(); j++) {
				char toPrint = getChar(field, i, j);
				System.out.print(toPrint + " ");
			}
			System.out.println();
		}
	}
	
	private int getNumDisplayLength(int number) {
		int len = 1;
		while (number / (int)Math.pow(10, number) != 0) {
			len++;
		}
		return len;
	}
	
	private String getNSpaces(int n) {
		String spaces = "";
		for (int i = 0; i < n; i++) {
			spaces += " ";
		}
		return spaces;
	}
	
	private char getChar(Minefield field, int row, int col) {
		if (field.hasMineAt(row, col)) {
			return MINE_MARKER_CHAR;
		}
		return (char)('0' + field.adjacentMines(row, col));
	}
}
