using System;
using System.Threading;

namespace ThreadedLazySingleton
{
    public class Client
    {
        static void Main()
        {
            Client client = new Client();
            for (int i = 0; i < 11; i++)
            {
                Thread thr = new Thread(new ThreadStart(client.Run));
                thr.Start();
            }
        }

        public void Run()
        {
            ThreadedLazySingleton ls = ThreadedLazySingleton.Instance;
            ls.PrintName();
        }
    }
}
