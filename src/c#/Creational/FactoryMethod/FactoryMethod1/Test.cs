using System;
using System.Collections.Generic;

namespace FactoryMethod1
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
			hr.AddNewEmployee(employeeFactory.Create());
			hr.AddNewEmployee(employeeFactory.Create());
			hr.AddNewEmployee(employeeFactory.Create());
            hr.AddNewEmployee(managerFactory.Create());
            hr.AddNewEmployee(managerFactory.Create());
            hr.AddNewEmployee(directorFactory.Create());

            hr.ListEmployees();

			Console.WriteLine();

			// Now pay time!
			List<Employee> employees = hr.GetEmployees();

			foreach (Employee employee in employees)
				po.PaySalary(employee);
		}
	}
}
