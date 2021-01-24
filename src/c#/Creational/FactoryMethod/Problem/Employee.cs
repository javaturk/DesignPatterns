using System;
using System.Text;

namespace Problem
{
    public class Employee
    {
        public int no{get; set;}
        public String name{get; set; }
        public int year { get; set; }
        public string department {get; set; }
        public double salary {get; set; }

        // Available types are "Employee", "Manager", "Director"
        public string type {get;}

        // Only for Managers & Director
        public string departmentManaged {get;}

        // Bonus only for Director
        public double bonus {get;}

        public static readonly int BASE_SALARY = 500;
        public static readonly int MANAGEMENT_PAYMENT = 3000;

        public Employee(int no, String name, int year, string department, string type)
        {
            this.no = no;
            this.name = name;
            this.year = year;
            this.department = department;
            this.type = type;
        }

        public Employee(int no, String name, int year, string department, String type, string departmentManaged)
        {
            this.no = no;
            this.name = name;
            this.year = year;
            this.department = department;
            this.departmentManaged = departmentManaged;
            this.type = type;
        }

        public Employee(int no, String name, int year, string department, string type, string departmentManaged,
                double bonus)
        {
            this.no = no;
            this.name = name;
            this.year = year;
            this.department = department;
            this.type = type;
            this.departmentManaged = departmentManaged;
            this.bonus = bonus;
        }

        public void Work()
        {
            if (type.Equals("Director"))
            {
                Manage();
                MakeAStrategicPlan();
            }
            else if (type.Equals("Manager"))
            {
                Manage();
            }
            else
                Console.WriteLine("Employee is working!");
        }

        public double CalculateSalary()
        {
            switch (type)
            {
                case "Employee":
                    salary = year * BASE_SALARY;
                    break;

                case "Manager":
                    salary = year * BASE_SALARY + MANAGEMENT_PAYMENT;
                    break;

                case "Director":
                    salary = year * BASE_SALARY + MANAGEMENT_PAYMENT + bonus;
                    break;
            }
            return salary;
        }

        public void Manage()
        {
            if (type.Equals("Director"))
                Console.WriteLine("Director manages whole company!");
            else if (type.Equals("Manager"))
                Console.WriteLine("Manager manages department: " + departmentManaged);
            else
                Console.WriteLine("I am just a poor Employee and can only manage myself!");
        }

        public void MakeAStrategicPlan()
        {
            if (type.Equals("Director"))
                Console.WriteLine("Director makes a strategic plan for the company!");
            else
                Console.WriteLine("I am not a Director and can't make any strategic plan!");
        }

        public override string ToString()
        {
            StringBuilder builder = new StringBuilder("\nEmployee Info");
            builder.Append("Type: " + type);

            if (type.Equals("Director"))
                builder.Append("Director of the company!");
            builder.Append("No: " + no);
            builder.Append("Name:" + name);
            builder.Append("Year: " + year);
            builder.Append("Department: " + department);
            builder.Append("Salary: " + CalculateSalary());
            
            if (type.Equals("Manager"))
                builder.Append("Manages: " + departmentManaged);
            return builder.ToString();
        }
    }
}
