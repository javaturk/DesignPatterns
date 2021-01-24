package org.javaturk.dp.ch06.visitor.factory;

public class HealthVisitor implements Visitor{
	
	public void visit(Employee employee){
		
		if(employee instanceof Manager)
			checkPsychologicalStatus((Manager) employee);
		
		int year = employee.getYear();
		if(year > 5)
			checkHealthStatus(employee);
	}
	
	public void visit(Boss boss){
		if(boss.getAge() > 50)
			checkHealthStatus(boss);
	}
	
	private void checkHealthStatus(Employee employee){
		System.out.println("Checking the health status of employee: " + employee.getNo() + " "+ employee.getName());
	}
	
	private void checkPsychologicalStatus(Manager employee){
		System.out.println("Checking the psychological status of manager: " + employee.getNo() + " "+ employee.getName());
	}
	
	private void checkHealthStatus(Boss boss){
		System.out.println("Checking the health status of boss: " + boss.getName());
	}
}
