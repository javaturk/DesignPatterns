using System;
using FactoryMethod1;
using System.Collections.Generic;

namespace FactoryMethod4
{
    public class Test
    {
		static void Main()
		{
			HR hr = new HR();
			PayrollOffice po = new PayrollOffice();

			// Add more employees
			hr.AddNewEmployee(EmployeeFactory.Create("Employee"));
			hr.AddNewEmployee(EmployeeFactory.Create("Employee"));
			hr.AddNewEmployee(EmployeeFactory.Create("Employee"));
            hr.AddNewEmployee(EmployeeFactory.Create("Manager"));
            hr.AddNewEmployee(EmployeeFactory.Create("Manager"));
            hr.AddNewEmployee(EmployeeFactory.Create("Director"));

            hr.ListEmployees();

			Console.WriteLine();

			// Now pay time!
			List<Employee> employees = hr.GetEmployees();

			foreach (Employee employee in employees)
				po.PaySalary(employee);
		}
	}
}
