using System;
using System.Runtime.Serialization.Formatters.Binary;
using System.Runtime.Serialization;
using System.IO;

using System.Reflection;

namespace EnumSingletonNamespace
{
    public class EnumSingletonClient
    {
        static void Main()
        {
            for (int i = 0; i < 10; i++)
            {
                EnumSingletonWrapper.EnumSingleton singleton = EnumSingletonWrapper.EnumSingleton.SINGLETON;
                Console.WriteLine(singleton.ToString());
            }

            serializeSingleton();
        }

        static void serializeSingleton()
        {   // Serialize the singleton object
            EnumSingletonWrapper.EnumSingleton singleton = EnumSingletonWrapper.EnumSingleton.SINGLETON;
            IFormatter formatter = new BinaryFormatter();
            Stream stream = new FileStream("/Users/akin/Desktop/Singleton.ser", FileMode.Create, FileAccess.Write);
            formatter.Serialize(stream, singleton);
            stream.Close();

            // De-serialize back to create another singleton object
            stream = new FileStream("/Users/akin/Desktop/Singleton.ser", FileMode.Open, FileAccess.Read);
            EnumSingletonWrapper.EnumSingleton anotherSingleton = (EnumSingletonWrapper.EnumSingleton)formatter.Deserialize(stream);
            stream.Close();

            // They are the same object
            if (singleton == anotherSingleton)
                Console.WriteLine("The same object!");
            else
                Console.WriteLine("Different objects!");
        }
    }
}
