using System;
namespace GUIAbstractFactory2
{
	public class Table : IComponent
	{
		public void Paint()
		{
			Console.WriteLine("Painting a table!");
		}
	}
}
