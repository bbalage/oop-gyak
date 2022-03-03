package main;

import java.util.Scanner;

public class Runner {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		for (int i = 0; i < emps.length; i++) {
			emps[i] = new Employee();
			readEmployee(emps[i]);
		}
		printArray(emps);
		int maxI = getHighestSalaryIndex(emps);
		System.out.println("Highest salary: " + emps[maxI].toString());
		System.out.println("Within boundaries: " + countEmpsWithSalaryInInterval(emps, 200, 300));
		System.out.println("Avg salary: " + calcAvgSalary(emps));
		System.out.println("Tax sum: " + calcTaxSum(emps));
		sc.close();
	}

	static int getHighestSalaryIndex(Employee[] emps) {
		int maxI = 0;
		for (int i = 1; i < emps.length; i++) {
			if (emps[i].hasHigherSalaryThan(emps[maxI])) {
				maxI = i;
			}
		}
		return maxI;
	}
	
	static int countEmpsWithSalaryInInterval(Employee[] emps, int lower, int upper) {
		int count = 0;
		for (Employee emp: emps) {
			if (emp.isWithinBoundaries(lower, upper)) {
				count++;
			}
		}
		return count;
	}
	
	static int calcAvgSalary(Employee[] emps) {
		int sum = 0;
		for (Employee emp: emps) {
			sum += emp.getSalary();
		}
		return sum / emps.length;
	}
	
	static int calcTaxSum(Employee[] emps) {
		int taxSum = 0;
		for (Employee emp: emps) {
			taxSum += emp.getTax();
		}
		return taxSum;
	}
	
	static void readEmployee(Employee emp) {
		String name = sc.nextLine();
		int salary = Integer.parseInt(sc.nextLine());
		emp.setName(name);
		emp.setSalary(salary);
	}
	
	static void printArray(Employee[] emps) {
		for (Employee emp: emps) {
			System.out.println(emp.toString());
		}
	}
}
