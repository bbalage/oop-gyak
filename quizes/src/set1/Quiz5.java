package set1;

import java.util.Scanner;

public class Quiz5 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = sc.nextLine();
		String copy = "hello";
		if (input.equals(copy)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}
