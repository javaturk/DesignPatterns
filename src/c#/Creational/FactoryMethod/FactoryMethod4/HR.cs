using System;
using FactoryMethod1;
using System.Collections.Generic;

namespace FactoryMethod4
{
    public class HR
    {
        private List<Employee> employees = new List<Employee>();

		public List<Employee> GetEmployees()
		{
			return employees;
		}

		public int GetNumberOfEmployees()
		{
			return employees.Count;
		}

		public void AddNewEmployee(Employee employee)
		{
			employees.Add(employee);
		}

		public void ListEmployees()
		{
			Console.WriteLine("All Employees");
			foreach (Employee employee in employees)
				Console.WriteLine(employee);
		}
    }
}
