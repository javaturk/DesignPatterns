using System;
namespace DesignPatterns.org.javaturk.dp.basic.pattern.gof.structural.proxy.basbakan
{
    public class VekilBasbakan : IBasbakan
    {
        private IBasbakan gercekBasbakan;

        public VekilBasbakan(IBasbakan gercekBasbakan)
        {
            this.gercekBasbakan = gercekBasbakan;
        }

        public void DertDinle(String dert)
        {
            Console.WriteLine("\nVekil: Derdinizi dinliyorum.");

            //      if(......)  
            bool ayiklandi = Ayikla(dert);
            if (ayiklandi)
                Ilet(dert);
        }

        public void IsBul(String yakinim)
        {
            Console.WriteLine("\nVekil: Isteginizi dinliyorum.");
        }

        private bool Ayikla(String dert)
        {
            bool b = true;
            // Bütün kontroller burada!
            return b;
        }

        private void Ilet(String dert)
        {
            gercekBasbakan.DertDinle(dert);
        }
    }
}
