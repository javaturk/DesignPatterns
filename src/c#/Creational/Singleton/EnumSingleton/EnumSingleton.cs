using System;
namespace EnumSingletonNamespace
{
	/**public enum EnumSingleton
	{
		SINGLETON
	}

	public static class EnumSingletonExtensions
	{
		public static bool IsWhite(this Colors c)
		{
			return c == Colors.White;
		}
		public static bool IsRedOrBlue(this Colors c)
		{
			return c == Colors.Red || c == Colors.Blue;
		}
	}*/

	public class EnumSingletonWrapper {

	    public enum EnumSingleton
	    {
		     SINGLETON
	    }

        private EnumSingletonWrapper()
		{
		}

		// In fact no need for this method because SINGLETON is already public.
		public static EnumSingleton Instance
		{
            get { 
			    return EnumSingleton.SINGLETON;
			}
		}

		public void PrintName()
		{
			Console.WriteLine(EnumSingleton.SINGLETON.ToString());
		}
	}
}
