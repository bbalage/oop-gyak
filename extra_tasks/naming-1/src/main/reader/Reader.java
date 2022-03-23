package main.reader;

import java.util.Scanner;

public class Reader {
	
	private final Scanner sc;
	
	public Reader(Scanner sc) {
		this.sc = sc;
	}
	
	public MineFieldSize readMineFieldSize() {
		boolean ok;
		int rows = 0, cols = 0;
		do {
			System.out.println("Please, insert two positive numbers between 1 and 100 divided by one space!");
			ok = true;
			String input = sc.nextLine();
			String[] nums = input.split(" ");
			if (nums.length != 2) {
				System.out.println("Not two numbers!");
				ok = false;
				continue;
			}
			try {
				rows = Integer.parseInt(nums[0]);
				cols = Integer.parseInt(nums[1]);
			} catch(Exception e) {
				ok = false;
				System.out.println("Error! Bad format.");
				continue;
			}
			if (rows <= 0 || cols <= 0) {
				ok = false;
				System.out.println("Error! Bad numbers.");
				continue;
			}
		} while (!ok);
		return new MineFieldSize(rows, cols);
	}
	
	public int readNumberOfMines(int max) {
		boolean ok;
		int numberOfMines = 0;
		do {
			System.out.println("Please insert number of mines! (0 - " + max + ")");
			ok = true;
			String input = sc.nextLine();
			try {
				numberOfMines = Integer.parseInt(input);
			} catch (Exception e) {
				ok = false;
				System.out.println("Bad number format.");
				continue;
			}
			if (numberOfMines < 0 || numberOfMines > max) {
				ok = false;
				System.out.println("Number of mines too large!");
			}
		} while (!ok);
		return numberOfMines;
	}
	
	public void close() {
		sc.close();
	}
}
