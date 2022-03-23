package main;

import java.util.Scanner;

import main.draw.Drawer;
import main.mines.Minefield;
import main.reader.MineFieldSize;
import main.reader.Reader;

public class Run {

	public static void main(String[] args) {
		Reader reader = new Reader(new Scanner(System.in));
		MineFieldSize minefieldSize = reader.readMineFieldSize();
		int numberOfMines = reader.readNumberOfMines(minefieldSize.calcNumberOfFields());
		Minefield minefield= new Minefield(minefieldSize.rows, minefieldSize.cols, numberOfMines);
		Drawer drawer = new Drawer();
		drawer.drawMineField(minefield);
		reader.close();
	}

}
