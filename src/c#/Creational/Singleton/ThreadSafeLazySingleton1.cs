using System;
namespace ThreadSafeLazySingleton1
{
    public class ThreadSafeLazySingleton1
    {
        private static ThreadSafeLazySingleton1 singleton;

        private static ThreadSafeLazySingleton1 instance;
        private static readonly object lockObject = new object();

        private static int count;
        private readonly String name;

        private ThreadSafeLazySingleton1()
        {
            count++;
            name = "ThreadSafeLazySingleton1" + count;
        }

        public static ThreadSafeLazySingleton1 Instance
        {
            get
            {
                lock (lockObject)
                    if (instance == null)
                        instance = new ThreadSafeLazySingleton1();
                return instance;
            }
        }

        public void PrintName()
        {
            Console.WriteLine(name);
        }
    }
}
