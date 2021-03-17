using System;
namespace DesignPatterns.org.javaturk.dp.basic.pattern.gof.structural.proxy.basbakan
{
    public class BasbakanlikKalemi
    {
        private IBasbakan basbakan;

        public BasbakanlikKalemi(IBasbakan basbakan)
        {
            this.basbakan = new VekilBasbakan(basbakan);
        }

        public IBasbakan BanaBasbakaniVer()
        {
            Console.WriteLine("Başbakanlık Kalemi: Tabi efendim");
            return basbakan;
        }
    }
}
