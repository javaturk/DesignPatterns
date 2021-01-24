using System;
using Util;

namespace FactoryMethod2
{
    public class ManagerFactory : IFactory
    {
        public Employee Create(string name) { 
            string department = EmployeeRandomizer.CreateDepartment();
            Manager manager = new Manager(EmployeeRandomizer.CreateId(), name,
                EmployeeRandomizer.CreateYear(), department, department);
            return manager;
        }
    }
}
