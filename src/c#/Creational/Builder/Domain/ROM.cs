using System;
namespace Domain
{
    public class ROM
    {
		private readonly int size;  // Size of ROM in MB

		public ROM(int size)
		{
			this.size = size;
		}

		public byte[] GetOSKernelImage()
		{
			Console.WriteLine("ROM: Loading the image of OS kernel.");
			byte[] kernelImage = new byte[2 * 1024 * 1024];

			// ...

			return kernelImage;
		}
	}
}
