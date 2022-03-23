package main.draw;

import main.mines.Flield;

public class Cucc {
	
	private static final int MAX_NUMBER_LENGTH = 3;
	private static final char MINE_MARKER_CHAR = 'x';
	
	public void doYourThing(Flield f) {
		System.out.println();
		for (int i = 0; i < f.getter2(); i++) {
			int n = getUsefulNumber(i);
			String add = getS(MAX_NUMBER_LENGTH - n + 1);
			System.out.print(i + add + ":: ");
			for (int j = 0; j < f.getter1(); j++) {
				char c = getNeeded(f, i, j);
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
	
	private int getUsefulNumber(int number) {
		int l = 1;
		while (number / (int)Math.pow(10, l) != 0) {
			l++;
		}
		return l;
	}
	
	private String getS(int n) {
		String chs = "";
		for (int i = 0; i < n; i++) {
			chs += " ";
		}
		return chs;
	}
	
	private char getNeeded(Flield field, int row, int col) {
		if (field.problematic(row, col)) {
			return MINE_MARKER_CHAR;
		}
		return (char)('0' + field.bigBooms(row, col));
	}
}
