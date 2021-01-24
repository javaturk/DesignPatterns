using System;
using Util;

namespace FactoryMethod1
{
    public class DirectorFactory : IFactory
    {
        public Employee Create()
        {
            Director director = new Director(EmployeeRandomizer.CreateId(), EmployeeRandomizer.CreateName(),
                    EmployeeRandomizer.CreateYear(), "Management", "Management", 5000);
            return director;
        }
    }
}
