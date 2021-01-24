package org.javaturk.dp.ch03.ocp.factory.solution;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class EmployeeFactory implements Factory {

	@Override
	public Employee create() {
		Employee employee = new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}

}
