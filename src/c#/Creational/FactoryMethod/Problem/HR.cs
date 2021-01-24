using System;
using System.Collections.Generic;

namespace Problem
{
    public class HR
    {
		private List<Employee> employees = new List<Employee>();

		public HR()
		{
			Employee employee = new Employee(1, "Ahmet", 10, "Production", "Employee");
			employees.Add(employee);
			employee = new Employee(2, "Zeynep", 3, "Sales", "Employee");
			employees.Add(employee);
			employee = new Employee(3, "Kemal", 7, "Production", "Employee");
			employees.Add(employee);

			Employee manager = new Employee(20, "Ahmet", 10, "Marketing", "Manager", "Marketing");
			employees.Add(manager);
			manager = new Employee(21, "Mehmet", 14, "Production", "Manager", "Production");
			employees.Add(manager);

			Employee director = new Employee(30, "Ahmet", 19, "Company", "Director", "Company", 5000);
			employees.Add(director);

		}

		public void AddNewEmployee(int no, String name, int year, String department, String type, String departmentManaged,
				double bonus)
		{
			Employee employee;
			switch (type)
			{
				case "Employee":
					employee = new Employee(no, name, year, department, type);
					employees.Add(employee);
					break;

				case "Manager":
					employee = new Employee(no, name, year, department, type, departmentManaged);
					employees.Add(employee);
					break;

				case "Director":
					employee = new Employee(no, name, year, department, type, departmentManaged, bonus);
					employees.Add(employee);
					break;
			}
		}

		public List<Employee> GetEmployees()
		{
			return employees;
		}

		public int GetNumberOfEmployees()
		{
			return employees.Count;
		}
	}
}
