using System;
using Util;

namespace FactoryMethod1
{
    public class EmployeeFactory : IFactory
    {
        public Employee Create()
        {
            Employee employee = new Employee(EmployeeRandomizer.CreateId(), EmployeeRandomizer.CreateName(),
                EmployeeRandomizer.CreateYear(), EmployeeRandomizer.CreateDepartment());
            return employee;
        }
    }
}
