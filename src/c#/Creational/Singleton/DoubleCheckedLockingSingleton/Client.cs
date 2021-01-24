using System;
using System.Threading;

namespace DoubleCheckedLockingSingleton
{
    public class Client
    {

		static void Main()
		{
			Client client = new Client();

			for (int i = 0; i < 1_000; i++)
			{
				Thread thr = new Thread(new ThreadStart(client.Run));
				thr.Start();
			}
		}

		public void Run()
		{
			DoubleCheckedLockingSingleton ls = DoubleCheckedLockingSingleton.Instance;
			ls.PrintName();
		}
	}
}
