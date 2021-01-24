using System;
using System.Collections.Generic;

namespace FactoryMethod2
{
    public class Test
    {
		static void Main()
		{
			HR hr = new HR();
			PayrollOffice po = new PayrollOffice();

			IFactory employeeFactory = new EmployeeFactory();
			IFactory managerFactory = new ManagerFactory();
			IFactory directorFactory = new DirectorFactory();

			// Add more employees
			hr.AddNewEmployee(employeeFactory.Create("Ayse"));
			hr.AddNewEmployee(employeeFactory.Create("Mutlu"));
			hr.AddNewEmployee(employeeFactory.Create("Zafer"));
            hr.AddNewEmployee(managerFactory.Create("Kemal"));
            hr.AddNewEmployee(managerFactory.Create("Halil"));
            hr.AddNewEmployee(directorFactory.Create("Tulin"));

            hr.ListEmployees();

			Console.WriteLine();

			// Now pay time!
			List<Employee> employees = hr.GetEmployees();

			foreach (Employee employee in employees)
				po.PaySalary(employee);
		}
	}
}
