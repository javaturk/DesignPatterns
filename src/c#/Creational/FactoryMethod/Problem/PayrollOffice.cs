using System;
namespace Problem
{
    public class PayrollOffice
    {
		public void PaySalary(Employee employee)
		{
			string type = employee.type;
			string name = employee.name;
			string department = employee.department;
			double salary = employee.CalculateSalary();

			Console.WriteLine("Paying " + salary + " to " + type + " " + name + " in " + department);
		}
	}
}
