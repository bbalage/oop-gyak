package main;

public class Task1 {

	public static void main(String[] args) {
		double[] nums = leibnitz(100);
		// double[] nums = wallis(100);
		// printDifferenceFrom(PI);
		// printArray(nums);
	}
	
	static double[] leibnitz(int max) {
		double[] nums = new double[max];
		double current = 1;
		for (int i = 0; i < max; i++) {
			double addendum = 1 / (double)(3 + i * 2);
			if (i % 2 == 0) {
				addendum *= -1;
			}
			current += addendum;
			nums[i] = current * 4;
		}
		return nums;
	}
	
	static void printArray(double[] nums) {
		for (double num : nums) {
			num += 1;
		}
		for (double num : nums) {
			System.out.println(num);
		}
	}

}
