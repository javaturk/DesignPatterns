package org.javaturk.dp.ch02.factory.problem;

public class Employee {
	private static final int BASE_SALARY = 500;
	protected int no;
	protected String name;
	protected int year;
	protected String department;

	private String type;

	public Employee(int no, String name, int year, String department) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
	}

	public Employee(int no, String name, int year) {
		this.no = no;
		this.name = name;
		this.year = year;
	}

	public void work() {
		System.out.println("Employee is working!");
	}

	public void manage() {
		if (type.equals("Director"))
			System.out.println("Director is managing the whole company!");
		else if (type.equals("Manager"))
			System.out.println("Manager is managing his/her department!");
		else
			System.out.println("I am just a poor Employee and can only manage myself!");
	}

	public void makeAStrategicPlan() throws IamNotDirectorException {
		if (type.equals("Director"))
			System.out.println("Director is naking a strategic plan for the company!");
		else
			throw new IamNotDirectorException();
		
	}

	public void printInfo() {
		System.out.println("\nNo: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
	}

	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + "]";
	}

	public double calculateSalary() {
		return year * BASE_SALARY;
	}
}
