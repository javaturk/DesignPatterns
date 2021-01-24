using System;
namespace GUIAbstractFactory2
{
	public class List : IComponent
	{
		public void Paint()
		{
			Console.WriteLine("Painting a list!");
		}
	}
}
