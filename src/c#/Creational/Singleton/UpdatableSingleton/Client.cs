using System;
using System.Threading;

namespace UpdatableSingleton
{
    public class Client
    {
        private string name;
        private static int initial = 0;
        private int price = 50;

        public Client()
        {
            initial++;
            price += initial;
            name = "UpdatableSingletonClient-" + initial;
        }

        public static void Main()
        {
            for (int i = 0; i < 10; i++)
            {
                Client client = new Client();
                Thread thread = new Thread(new ThreadStart(client.Run));
                thread.Start();
            }
        }

        public void Run()
        {
            UpdatableSingleton us = UpdatableSingleton.getInstance();
            us.UpdateProduct(name, "Book", price);
        }
    }
}
