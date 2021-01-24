using System;
using System.Collections.Generic;
namespace UpdatableSingleton
{
    public class UpdatableSingleton
    {
        private static UpdatableSingleton updatableSingleton = new UpdatableSingleton();

        private readonly IDictionary<string, int> products = new Dictionary<string, int>();
        private static readonly object lockObject = new object();

        private UpdatableSingleton()
        {
            products.Add("Book", 20);
            products.Add("Pen", 5);
            products.Add("Notebook", 9);
        }

        public static UpdatableSingleton getInstance()
        {
            return updatableSingleton;
        }

        public void UpdateProduct(string threadName, string name, int price)
        {
            lock (lockObject)
            {
                Console.WriteLine(threadName + " ==> Price for " + name + " before update: " + GetPrice(name));
                products[name] = price; // Update the price for the item
                Console.WriteLine(threadName + " ==> Price for " + name + " after update: " + GetPrice(name));
            }
        }

        private int GetPrice(String name)
        {
            return products[name];
        }
    }
}
