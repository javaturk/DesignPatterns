using System;
using System.Reflection;

/// First compile Singleton.cs as a dll file using "csc /target:library Singleton.cs" then run this.
namespace SingletonReflection { 
    public class Client
    {

        static void Main()
        {
            Assembly assembly = Assembly.LoadFrom("/Users/akin/Development/C#/Design Patterns/Creational/Singleton/SingletonReflection/Singleton.dll");
            Type singletonType = assembly.GetType("SingletonReflection.Singleton", true, true);

            //SingletonReflection.SingletonReflection.Singleton singleton = (SingletonReflection.SingletonReflection.Singleton)Activator.CreateInstance(singletonType);
            //singleton.PrintName();

            for(int i = 0; i < 10; i++)
            {
                var singleton = Activator.CreateInstance(singletonType, true);
                //Console.WriteLine(singleton.GetType());
                dynamic x = singleton;
                x.PrintName();
            }
        }
    }
}

