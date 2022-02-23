package set1;

public class Quiz1 {
	
	static int length = 10;

	public static void main(String[] args) {
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
