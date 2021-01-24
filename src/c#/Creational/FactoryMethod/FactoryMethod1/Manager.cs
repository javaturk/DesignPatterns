using System;

namespace FactoryMethod1
{
    public class Manager : Employee
    {
		protected string departmentManaged { get;}

		public static readonly int MANAGEMENT_PAYMENT = 3000;

		public Manager(int no, string name, int year, string workingDepartment, string departmentManaged) : base(no, name, year, workingDepartment)
		{	
			this.departmentManaged = departmentManaged;
		}

		public override void Work()
		{
			Console.WriteLine("Manager is working!");
			Manage();
		}

		public virtual void Manage()
		{
			Console.WriteLine("Manager manages department: " + departmentManaged);
		}

		public override double CalculateSalary()
		{
			return base.CalculateSalary() + MANAGEMENT_PAYMENT;
		}
	}
}