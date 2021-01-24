using System;
namespace Domain
{
    public class RAM
    {
		private BIOS bios;

		public RAM()
		{
			bios = new BIOS();
		}

		public void LoadOSKernelImage()
		{
			Console.WriteLine("RAM: Loading the image of OS kernel.");
			bios.Start();
			Console.WriteLine("RAM: Image of OS kernel has been loaded.");
		}

		public void LoadOS()
		{
			Console.WriteLine("OS has been loaded.");
		}

		public void LoadDrivers()
		{
			Console.WriteLine("Drivers have been loaded.");
		}

		public void StartServices()
		{
			Console.WriteLine("Services have started.");
		}
	}
}
