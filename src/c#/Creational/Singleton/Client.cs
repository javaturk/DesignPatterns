using System;
using System.Threading;

namespace ThreadSafeLazySingleton1
{
    public class Client
    {
		static void Main()
		{
			Client client = new Client();
			for (int i = 0; i < 1000; i++)
			{
				Thread thr = new Thread(new ThreadStart(client.Run));
				thr.Start();
			}
		}

		public void Run()
		{
			ThreadSafeLazySingleton1 s = ThreadSafeLazySingleton1.Instance;
			s.PrintName();
		}
	}
}
