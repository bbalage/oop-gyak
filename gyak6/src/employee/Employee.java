package employee;

public class Employee {
	
	private String name;
	private int age;
	private int salary;
	
	private static int retirementAge = 65;

	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, int age) {
		this(name, age, age * 10000);
	}
	
	public int yearsTillRetirement() {
		return retirementAge - age;
	}
	
	public static Employee moreYearsTillRetirement(Employee emp1, Employee emp2) {
		return emp1.yearsTillRetirement() > emp2.yearsTillRetirement() ? emp1 : emp2;
	}
	
	public static void setRetirementAge(int retirementAge) {
		Employee.retirementAge = retirementAge;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", yearsTillRetirement="
				+ yearsTillRetirement() + "]";
	}
}
