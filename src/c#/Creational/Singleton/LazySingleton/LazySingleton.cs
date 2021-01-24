using System;
namespace Singleton {
    public class LazySingleton {
      
        private static LazySingleton singleton;

        private static int count;
        private String name;

        private LazySingleton() {
            count++;
            name = "LazySingleton" + count;
        }

        public static LazySingleton Instance {
            get
            {
                if (singleton == null)
                    singleton = new LazySingleton();
                return singleton;
            }
        }

        public void PrintName() {
            Console.WriteLine(name);
        }
    }
}
