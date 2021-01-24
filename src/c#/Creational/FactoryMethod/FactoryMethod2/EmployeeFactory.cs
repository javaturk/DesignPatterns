using System;
using Util;

namespace FactoryMethod2
{
    public class EmployeeFactory : IFactory
    {
        public Employee Create(string name)
        {
            Employee employee = new Employee(EmployeeRandomizer.CreateId(), name,
                EmployeeRandomizer.CreateYear(), EmployeeRandomizer.CreateDepartment());
            return employee;
        }
    }
}
