using System;
using System.Collections.Generic;

namespace Problem
{
    public class Test
    {
		static void Main()
		{
			HR hr = new HR();
			PayrollOffice po = new PayrollOffice();

			// Add more employees
			hr.AddNewEmployee(5, "Sami", 2, "Production", "Employee", null, 0);
			hr.AddNewEmployee(6, "Ozlem", 4, "Production", "Employee", null, 0);

			// Now pay time!
			List<Employee> employees = hr.GetEmployees();

			foreach (Employee employee in employees)
				po.PaySalary(employee);

		}
	}
}
