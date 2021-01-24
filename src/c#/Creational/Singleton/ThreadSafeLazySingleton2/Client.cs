using System;
using System.Threading;

namespace ThreadSafeLazySingleton2
{
    public class Client
	{
		static void Main()
		{
			Client client = new Client();
			for (int i = 0; i < 100; i++)
			{
				Thread thread = new Thread(new ThreadStart(client.Run));
				thread.Start();
			}
		}

		public void Run()
		{
			ThreadSafeLazySingleton2 s = ThreadSafeLazySingleton2.Instance;
			s.PrintName();
		}
	}
}
