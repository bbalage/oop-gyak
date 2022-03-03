package main;

public class Employee {

	private String name;
	private int salary;
	
	void raiseSalary(int raise) {
		salary += raise;
	}
	
	public boolean isWithinBoundaries(int lower, int upper) {
		return lower <= salary && upper >= salary;
	}
	
	public int getTax() {
		return (int)(salary * 0.16);
	}
	
	public boolean hasHigherSalaryThan(Employee emp) {
		return salary > emp.getSalary();
	}
	
	@Override
	public String toString() {
		return name + ": " + salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
