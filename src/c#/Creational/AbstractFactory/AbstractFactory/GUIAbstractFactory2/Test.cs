using System;
namespace GUIAbstractFactory2
{
    public class Test
    {
        public static void Main()
        {
            new Client(new GUIFactory());
        }
    }
}
