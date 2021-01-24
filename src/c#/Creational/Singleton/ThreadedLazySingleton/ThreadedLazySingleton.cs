using System;
namespace ThreadedLazySingleton {
    public class ThreadedLazySingleton {
        private static ThreadedLazySingleton singleton;

        private static int count;
        private readonly String name;

        private ThreadedLazySingleton() {
            count++;
            name = "ThreadedLazySingleton" + count;
        }

        public static ThreadedLazySingleton Instance
        {
            get
            {
                if (singleton == null)
                    singleton = new ThreadedLazySingleton();
                return singleton;
            }
        }

        public void PrintName() {
            Console.WriteLine(name);
        }
    }
}
