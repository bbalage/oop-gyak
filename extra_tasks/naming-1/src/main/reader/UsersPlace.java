package main.reader;

import java.util.Scanner;

public class UsersPlace {
	
	private final Scanner sc;
	
	public UsersPlace(Scanner sc) {
		this.sc = sc;
	}
	
	public Vals ussr1() {
		boolean b;
		int u1 = 0, u2 = 0;
		do {
			System.out.println("Input...");
			b = true;
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			if (ss.length != 2) {
				System.out.println("Brr, grr, don't!");
				b = false;
				continue;
			}
			try {
				u1 = Integer.parseInt(ss[0]);
				u2 = Integer.parseInt(ss[1]);
			} catch(Exception e) {
				b = false;
				System.out.println("Lame");
				continue;
			}
			if (u1 <= 0 || u2 <= 0) {
				b = false;
				System.out.println("Lame.");
				continue;
			}
		} while (!b);
		return new Vals(u1, u2);
	}
	
	public int ratatacount(int notratata) {
		boolean fun;
		int n = 0;
		do {
			System.out.println("Please insert");
			fun = true;
			String s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			} catch (Exception e) {
				fun = false;
				System.out.println("Bad number format.");
				continue;
			}
			if (n < 0 || n > notratata) {
				fun = false;
				System.out.println("Number of mines too large!");
			}
		} while (!fun);
		return n;
	}
	
	public void finishHim() {
		sc.close();
	}
}
