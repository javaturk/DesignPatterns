using System;
namespace Singleton
{
    public class Client
    {

        static void Main()
        {
            for (int i = 0; i < 1000; i++)
            {
                Singleton s = Singleton.Instance;
                s.PrintName();
            }

            Singleton s1 = Singleton.Instance;
            Singleton s2 = Singleton.Instance;

            if (s1 == s2)
                Console.WriteLine("\nThe same object!");

            else
                Console.WriteLine("Different objects!");
        }
    }
}
