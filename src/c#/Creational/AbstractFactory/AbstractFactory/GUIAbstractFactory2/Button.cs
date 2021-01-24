using System;
namespace GUIAbstractFactory2
{
	public class Button : IComponent
	{
		public void Paint()
		{
			Console.WriteLine("Painting a button!");
		}
	}
}
