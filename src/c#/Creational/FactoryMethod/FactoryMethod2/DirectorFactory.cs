using System;
using Util;

namespace FactoryMethod2
{
    public class DirectorFactory : IFactory
    {
        public Employee Create(string name)
        {
            Director director = new Director(EmployeeRandomizer.CreateId(), name,
                    EmployeeRandomizer.CreateYear(), "Management", "Management", 5000);
            return director;
        }
    }
}
