using System;
using System.Text;

namespace Bloch
{
    public class Employee
    {
        public int no { get; set; }
        public String name { get; set; }
        public int year { get; set; }
        public string department { get; set; }
        public double salary { get; set; }

        public static readonly int BASE_SALARY = 500;

        private Employee(int no, String name, int year, string department)
        {
            this.no = no;
            this.name = name;
            this.year = year;
            this.department = department;
        }

        public static Employee CreateNewEmployee(int no, String name, String department)
        {
            return new Employee(no, name, 0, department);
        }

        public static Employee CreateNewTemporaryEmployee(int no, String name)
        {
            return new Employee(no, name, 0, "Temp");
        }

        public virtual void Work()
        {
            Console.WriteLine("Employee is working!");
        }

        public virtual double CalculateSalary()
        {
            salary = year * BASE_SALARY;
            return salary;
        }

        public override string ToString()
        {
            StringBuilder builder = new StringBuilder("\nEmployee Info");
            builder.Append("No: " + no);
            builder.Append("Name:" + name);
            builder.Append("Year: " + year);
            builder.Append("Department: " + department);
            builder.Append("Salary: " + CalculateSalary());
            return builder.ToString();
        }
    }
}
