package employee;

import java.util.Scanner;

public class Runner {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = 3;
		Employee[] emps = new Employee[n];
		for (int i = 0; i < emps.length; i++) {
			emps[i] = readEmployee();
		}
		System.out.println("Before changing retirement age.");
		printEmployees(emps);
		Employee.setRetirementAge(64);
		System.out.println("After changing retirement age.");
		printEmployees(emps);
		printThoseNCloseToRetirement(emps, 5);
		sortEmployees(emps, true);
		System.out.println("Sorted ascending:");
		printEmployees(emps);
		sortEmployees(emps, false);
		System.out.println("Sorted descending:");
		printEmployees(emps);
		sc.close();
	}
	
	static void printThoseNCloseToRetirement(Employee[] emps, int n) {
		for (Employee emp : emps) {
			if (emp.yearsTillRetirement() <= n) {
				System.out.println(emp);
			}
		}
	}
	
	static void printThoseFarFromRetirement(Employee[] emps) {
		double avgYearsTillRetirement = avgYearsTillRetirement(emps);
		for (Employee emp: emps) {
			if (emp.yearsTillRetirement() < avgYearsTillRetirement) {
				System.out.println(emp);
			}
		}
	}
	
	static double avgYearsTillRetirement(Employee[] emps) {
		int sum = 0;
		for (Employee emp: emps) {
			sum += emp.yearsTillRetirement();
		}
		return (double)sum / emps.length;
	}
	
	static void sortEmployees(Employee[] emps, boolean ascending) {
		int multiplier = ascending ? 1: -1;
		for (int i = 0; i < emps.length - 1; i++) {
			int minOrMaxIndex = i;
			for (int j = i + 1; j < emps.length; j++) {
				if (multiplier * emps[j].yearsTillRetirement() 
						< multiplier * emps[minOrMaxIndex].yearsTillRetirement()) {
					minOrMaxIndex = j;
				}
			}
			if (minOrMaxIndex != i) {
				Employee tmpEmp = emps[minOrMaxIndex];
				emps[minOrMaxIndex] = emps[i];
				emps[i] = tmpEmp;
			}
		}
	}
	
	static Employee readEmployee() {
		System.out.print("Please input name: ");
		String name = sc.nextLine();
		System.out.print("Please input age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("Please input salary: ");
		int salary = Integer.parseInt(sc.nextLine());
		return new Employee(name, age, salary);
	}
	
	static void printEmployees(Employee[] emps) {
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}

}
