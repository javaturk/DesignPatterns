package org.javaturk.dp.ch03.lsp.rtti;

public class Test {

	public static void main(String[] args) {
		System.out.println("All employees");
		HR hr = new HR();
		hr.listEmployees();
		
		System.out.println("*******************************************\n");

		Employee e = hr.getAnEmployee();
		if (e instanceof Director) {
			Director d = (Director) e;
			System.out.println("Bonus of director: " + d.getBonus());
		} else if (e instanceof Manager) {
			Manager m = (Manager) e;
			System.out.println("Department of manager: " + m.getDepartmentManaged());
		}
		else{
			System.out.println("Salary of employee: " + e.calculateSalary());
		}
	}
}
