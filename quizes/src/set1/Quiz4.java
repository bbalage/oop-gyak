package set1;

import java.util.Scanner;

public class Quiz4 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = sc.nextLine();
		String copy = input;
		if (input == copy) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

}
