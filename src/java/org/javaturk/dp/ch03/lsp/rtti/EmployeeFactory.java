package org.javaturk.dp.ch03.lsp.rtti;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class EmployeeFactory implements Factory {

	@Override
	public Employee create() {
		Employee employee = null;
		int i = (int) (Math.random() * 3);
		switch (i) {
		case 0:
			employee = new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
					EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
			break;
		case 1:
			employee = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
					EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment(),
					EmployeeRandomizer.createDepartment());
			break;
		case 2:
			employee = new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
					EmployeeRandomizer.createYear(), "Management", "Management", 5000);
			break;
		}
		return employee;
	}
}
