package main;

import java.util.Scanner;

public class Task1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int number = read1();
		
		System.out.println("Number read: " + number);
		sc.close();
	}
	
	static int read1() {
		int number = -1;
		boolean ok;
		do {
			ok = true;
			try {
				String text = sc.nextLine();
				number = Integer.parseInt(text);
				if (number < 1 || number > 10) {
					ok = false;
					System.out.println("Number not in range...");
				}
			} catch(Exception e) {
				ok = false;
				System.out.println("Input error...");
			}
		} while (!ok);
		return number;
	}

}
