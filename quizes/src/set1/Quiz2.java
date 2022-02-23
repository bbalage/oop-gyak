package set1;

public class Quiz2 {

	static int length = 10;
	
	public static void main(String[] args) {
		int[] arr = new int[length];
		for (int a: arr) {
			a = 10;
		}
		for (int a: arr) {
			System.out.print(a + " ");
		}
	}
}
