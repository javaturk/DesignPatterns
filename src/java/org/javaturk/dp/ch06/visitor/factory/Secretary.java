package org.javaturk.dp.ch06.visitor.factory;

public class Secretary extends Employee {

	protected Manager managerServed;
	
	public Secretary(int no, String name, int year, String department, Manager managerServed) {
		super(no, name, year, department);
	}
	
	public void serve(){
		System.out.println("Secretary " + name + " serves her manager: " + managerServed);
	}

}
