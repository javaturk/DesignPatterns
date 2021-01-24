using System;
namespace DesignPatterns.org.javaturk.dp.basic.pattern.gof.structural.proxy.basbakan
{
    public class GercekBasbakan : IBasbakan
    {

        public void DertDinle(string dert)
        {
            Console.WriteLine("Basbakan: Dinliyorum.");
        }

        public void IsBul(string yakinim)
        {
            Console.WriteLine("Basbakan: Bana boyle isteklerle gelmeyin.");
        }

    }
}
