package org.javaturk.dp.ch03.ocp.factory.solution;

public class Employee{
	protected int no;
	protected String name;
	protected int year;
	protected String department;
	protected double salary;
	
	public static final int BASE_SALARY = 500;
	
	public Employee(int no, String name, int year, String department){
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
	}
	
	public void work(){
		System.out.println("Employee is working!");
	}

	public double calculateSalary(){
		salary = year * BASE_SALARY;
		return salary;
	}
	
	public void printInfo(){
		System.out.println("\nEmployee Info");
		System.out.println("No: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
	}
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + ", salary="
				+ salary + "]";
	}
}
