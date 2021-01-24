using System;
namespace ThreadSafeLazySingleton2
{
    public class ThreadSafeLazySingleton2
    {
        private static ThreadSafeLazySingleton2 singleton;

        private static readonly Lazy<ThreadSafeLazySingleton2> instance =
        new Lazy<ThreadSafeLazySingleton2>(() => new ThreadSafeLazySingleton2());

        private static int count;
        private readonly String name;

        private ThreadSafeLazySingleton2()
        {
            count++;
            name = "ThreadSafeLazySingleton2" + count;
        }

        public static ThreadSafeLazySingleton2 Instance
        {
            get {
                return instance.Value;
            }
        }

        public void PrintName()
        {
            Console.WriteLine(name);
        }
    }
}
