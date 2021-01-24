package org.javaturk.dp.ch06.visitor.factory;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private int numberOfEmployees;
	private List<Employee> employees;
	
	private HR hr = new HR();
	
	public Company(int numberOfEmployees){
		this.numberOfEmployees = numberOfEmployees;
		employees = new ArrayList<Employee>(numberOfEmployees);
	}
	
	public void populateCompany(){
		for(int i = 0; i < numberOfEmployees; i++){
			employees.add(hr.getAnEmployee());
		}
	}

	public void setVisitor(Visitor hv) {
		for(Employee employee : employees)
			employee.accept(hv);
	}
}
