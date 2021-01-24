using System;
using FactoryMethod1;
using Util;

namespace FactoryMethod4
{
    public class EmployeeFactory
    {
		public static Employee Create(String type)
		{
			Employee employee = null;
			int id = EmployeeRandomizer.CreateId();
			String name = EmployeeRandomizer.CreateName();
			int year = EmployeeRandomizer.CreateYear();

			String department = EmployeeRandomizer.CreateDepartment();
			switch (type)
			{
				case "Employee":
					employee = new Employee(id, name, year, department);
					break;

				case "Manager":
					employee = new Manager(id, name, year, department, department);
					break;

				case "Director":
					employee = new Director(id, name, year, "Management", "Management", 5000);
					break;
			}
			return employee;
		}
	}
}
