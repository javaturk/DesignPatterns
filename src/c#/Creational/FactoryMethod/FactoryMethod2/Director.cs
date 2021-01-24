using System;
namespace FactoryMethod2
{
    public class Director : Manager
    {
		protected double bonus {get;}

		public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) : base(no, name, year, workingDepartment, managingDepartment)
		{
			this.bonus = bonus;
		}

		public override void Work()
		{
			Console.WriteLine("Director is working!");
			Manage();
		}

		public override void Manage()
		{
			Console.WriteLine("Director manages whole company!");
			MakeAStrategicPlan();
		}

		public void MakeAStrategicPlan()
		{
			Console.WriteLine("Director makes a strategic plan for the company!");
		}

		public override double CalculateSalary()
		{
			return base.CalculateSalary() + bonus;
		}
	}
}
