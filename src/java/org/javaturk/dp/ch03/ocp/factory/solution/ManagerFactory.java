package org.javaturk.dp.ch03.ocp.factory.solution;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class ManagerFactory implements Factory{

	@Override
	public Manager create() {
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment(), EmployeeRandomizer.createDepartment());
		return manager;
	}
}
