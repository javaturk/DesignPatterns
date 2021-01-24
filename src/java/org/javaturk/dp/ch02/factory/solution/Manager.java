package org.javaturk.dp.ch02.factory.solution;


public class Manager extends Employee{
	protected String departmentManaged;
	
	public static final int MANAGEMENT_PAYMENT = 3000;
	
	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged){
		super(no, name, year, workingDepartment);
		this.departmentManaged = departmentManaged;
	}
	
	public Manager(int no, String name, int year, String departmentManaged){
		super(no, name, year);
		this.departmentManaged = departmentManaged;
	}
	
	@Override
	public void work(){
		System.out.println("Manager is working!");
		manage();
	}
	
	public void manage(){
		System.out.println("Manager manages department: " + departmentManaged);
	}
	
	public double calculateSalary(){
		return super.calculateSalary() + MANAGEMENT_PAYMENT;
	}
	
	public void printInfo(){
		System.out.println("\nManager Info");
		super.printInfo();
		System.out.println("Managing Department: " + departmentManaged);
	}

	@Override
	public String toString() {
		return "Manager [departmentManaged=" + departmentManaged + ", no=" + no + ", name=" + name + ", year=" + year
				+ ", department=" + department + "]";
	}
}
