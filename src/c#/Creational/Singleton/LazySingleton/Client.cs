using System;
namespace Singleton {
    public class LazySingletonClient {
        static void Main(string[] args) {
            for (int i = 0; i < 100; i++) {
                LazySingleton s = LazySingleton.Instance;
                s.PrintName();
            }
        }
    }
}
