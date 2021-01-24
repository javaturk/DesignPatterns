using System;
namespace DesignPatterns.org.javaturk.dp.basic.pattern.gof.structural.proxy.basbakan
{
    public class Test
    {
        public static void Main(string[] args){
            Console.WriteLine("Vatandas başbakanlık kalemine gelir ve surec baslar.");
            
            IBasbakan basbakan = new GercekBasbakan();
            BasbakanlikKalemi kalem = new BasbakanlikKalemi(basbakan);

            Vatandas riza = new Vatandas(kalem);
            riza.DerdiniAnlat();
            riza.IsIste();
        }
    }
}
