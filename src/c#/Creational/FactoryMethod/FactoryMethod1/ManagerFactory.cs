using System;
using Util;

namespace FactoryMethod1
{
    public class ManagerFactory : IFactory
    {
        public Employee Create() { 
            string department = EmployeeRandomizer.CreateDepartment();
            Manager manager = new Manager(EmployeeRandomizer.CreateId(), EmployeeRandomizer.CreateName(),
                EmployeeRandomizer.CreateYear(), department, department);
            return manager;
        }
    }
}
