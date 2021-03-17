using System;
namespace DesignPatterns.org.javaturk.dp.basic.pattern.gof.structural.proxy.basbakan
{
    public class Vatandas
    {
        private IBasbakan basbakan;

        public Vatandas(BasbakanlikKalemi kalem)
        {
            basbakan = kalem.BanaBasbakaniVer();
        }

        public String DerdiniAnlat()
        {
            basbakan.DertDinle("Bir derdim var...");
            return "Yasasiiinnn!!!";
        }


        public String IsIste()
        {
            basbakan.IsBul("Oglum");
            return "Yasasiiinnn!!!";
        }
    }
}
