using System;
namespace Singleton
{
    public class Singleton
    {
        private static Singleton singleton = new Singleton();

        private static int count;
        private readonly String name;

        private Singleton()
        {
            count++;
            name = "Singleton" + count;
        }

        public static Singleton Instance
        {
            get
            {
                return singleton;
            }
        }

        public void PrintName()
        {
            Console.WriteLine(name);
        }
    }
}
