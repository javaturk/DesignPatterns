using System;
namespace Util
{
    public class EmployeeRandomizer
    {

		static void Main()
		{ }

		private static readonly Random random = new Random();

		private static readonly String[] firstNames = { "Ali", "Ayse", "Bahar", "Bekir", "Bulent", "Can", "Cem", "Demet", "Elif",
			"Eylem", "Faruk", "Fatma", "Ganime", "Gulsum", "Haydar", "Halil", "Ismail", "Jale", "Kemal", "Leman",
			"Mehmet", "Mihrimah", "Murat", "Mustafa", "Nedim", "Nilufer", "Selim", "Selman", "Sevda", "S¸leyman",
			"Tarik", "Teoman", "Turgut", "Yeliz", "Zuhal" };

		private static readonly String[] departments = { "Production", "Sales", "Marketing", "Engineering" };

		public static int CreateId()
		{
			int randomInt = random.Next(100000);
			return randomInt;
		}

		public static String CreateName()
		{
			int randomInt = random.Next(35);
			return firstNames[randomInt];
		}

		public static String CreateDepartment()
		{
			int randomInt = random.Next(4);
			return departments[randomInt];
		}

		public static int CreateYear()
		{
			int randomInt = random.Next(20);
			return randomInt;
		}
	}
}
