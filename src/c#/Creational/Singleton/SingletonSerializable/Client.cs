using System;
using System.Runtime.Serialization.Formatters.Binary;
using System.Runtime.Serialization;
using System.IO;

namespace SingletonSerializable
{

    public class Client
    {

        static void Main()
        {   // Serialize the singleton object
            Singleton singleton = Singleton.Instance;
            IFormatter formatter = new BinaryFormatter();
            Stream stream = new FileStream("/Users/akin/Desktop/Singleton.ser", FileMode.Create, FileAccess.Write);
            formatter.Serialize(stream, singleton);
            stream.Close();

            // De-serialize back to create another singleton object
            stream = new FileStream("/Users/akin/Desktop/Singleton.ser", FileMode.Open, FileAccess.Read);
            Singleton anotherSingleton = (Singleton) formatter.Deserialize(stream);
            stream.Close();

            if (singleton == anotherSingleton)
                Console.WriteLine("The same object!");
            else
                Console.WriteLine("Different objects!");
        }
    }
}
