using System;

namespace Domain
{
    internal class BIOS
    {
		private ROM rom;

		public BIOS()
		{
			rom = new ROM(2 * 1024);
		}

		public void Start()
		{
			Console.WriteLine("BIOS: Getting the image of OS kernel.");
			rom.GetOSKernelImage();
		}
	}
}