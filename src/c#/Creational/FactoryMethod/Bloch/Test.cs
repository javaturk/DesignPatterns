using System;

namespace Bloch
{
    public class Test
    {
		static void Main()
		{
			Employee newEmployee = Employee.CreateNewEmployee(4, "Ali", "Sales");
            Employee newTempEmployee = Employee.CreateNewTemporaryEmployee(4, "Ali");
		}
	}
}
