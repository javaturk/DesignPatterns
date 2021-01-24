using System;
namespace FactoryMethod2
{
    public class PayrollOffice
    {
		public void PaySalary(Employee employee)
		{
			string name = employee.name;
			string department = employee.department;
			double salary = employee.CalculateSalary();

			Console.WriteLine("Paying " + salary + " to " + " " + name + " in " + department);
		}
	}
}
