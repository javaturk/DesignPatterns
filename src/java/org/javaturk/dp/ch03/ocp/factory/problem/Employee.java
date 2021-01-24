
package org.javaturk.dp.ch03.ocp.factory.problem;

public class Employee {
	// For all type of Employees
	private int no;
	private String name;
	private int year;
	private String department;
	private double salary;

	// Available types are "Employee", "Manager", "Director"
	private String type;

	// Only for Managers & Director
	private String departmentManaged;

	// Bonus only for Director
	private double bonus;

	public static final int BASE_SALARY = 500;
	public static final int MANAGEMENT_PAYMENT = 3000;

	/**
	 * Constructor for pure Employee.
	 * 
	 * @param no
	 * @param name
	 * @param year
	 * @param department
	 * @param type
	 */
	public Employee(int no, String name, int year, String department, String type) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
		this.type = type;
	}

	/**
	 * Constructor for Manager.
	 * 
	 * @param no
	 * @param name
	 * @param year
	 * @param department
	 * @param type
	 */
	public Employee(int no, String name, int year, String department, String type, String departmentManaged) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
		this.departmentManaged = departmentManaged;
		this.type = type;
	}

	/**
	 * Constructor for Director.
	 * 
	 * @param no
	 * @param name
	 * @param year
	 * @param department
	 * @param type
	 */
	public Employee(int no, String name, int year, String department, String type, String departmentManaged,
			double bonus) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
		this.type = type;
		this.departmentManaged = departmentManaged;
		this.bonus = bonus;
	}

	public void work() {
		if (type.equals("Director")) {
			manage();
			makeAStrategicPlan();
		} else if (type.equals("Manager")) {
			manage();
		} else
			System.out.println("Employee is working!");
	}

	public double calculateSalary() {
		switch (type) {
		case "Employee":
			salary = year * BASE_SALARY;
			break;

		case "Manager":
			salary = year * BASE_SALARY + MANAGEMENT_PAYMENT;
			break;

		case "Director":
			salary = year * BASE_SALARY + MANAGEMENT_PAYMENT + bonus;
			break;
		}
		return salary;
	}

	public void manage() {
		if (type.equals("Director"))
			System.out.println("Director manages whole company!");
		else if (type.equals("Manager"))
			System.out.println("Manager manages department: " + departmentManaged);
		else
			System.out.println("I am just a poor Employee and can only manage myself!");
	}

	public void makeAStrategicPlan() {
		if (type.equals("Director"))
			System.out.println("Director makes a strategic plan for the company!");
		else
			System.out.println("I am not a Director and can't make any strategic plan!");
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

	public String getType() {
		return type;
	}

	public String getDepartmentManaged() {
		return departmentManaged;
	}

	public double getBonus() {
		return bonus;
	}

	public void printInfo() {
		System.out.println("\nEmployee Info");
		System.out.println("Type: " + type);
		if (type.equals("Director"))
			System.out.println("Director of the company!");
		System.out.println("No: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + calculateSalary());
		if (type.equals("Manager"))
			System.out.println("Manages: " + departmentManaged);
	}
}
