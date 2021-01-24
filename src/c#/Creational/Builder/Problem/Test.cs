using System;
using Domain;

namespace Problem
{
	public class Test
	{
		static void Main()
		{
			Test test = new Test();

			CPU cpu1 = test.ProduceCPU();
			RAM ram1 = test.ProduceRAM();
			HardDrive hd1 = test.ProduceHardDrive();
			GraphicCard graphicCard1 = test.ProduceGraphicCard();
			Computer computerWithoutDisplayKeyboardAndMouse = new Computer("computerWithoutDisplayKeyboardAndMouse", cpu1, ram1, hd1, graphicCard1);
			computerWithoutDisplayKeyboardAndMouse.Start();


			CPU cpu2 = test.ProduceCPU();
			RAM ram2 = test.ProduceRAM();
			HardDrive hd2 = test.ProduceHardDrive();
			GraphicCard graphicCard2 = test.ProduceGraphicCard();
			Display display2 = test.ProduceDisplay();
			Keyboard keyboard2 = test.ProduceKeyboard();
			Mouse mouse2 = test.ProduceMouse();
			Computer computerFull1 = new Computer("computer full1", cpu2, ram2, hd2, graphicCard2, display2, keyboard2, mouse2);
			computerFull1.Start();
		}

		public CPU ProduceCPU()
		{
			return new CPU();
		}

		private RAM ProduceRAM()
		{
			return new RAM();
		}

		public HardDrive ProduceHardDrive()
		{
			return new HardDrive();
		}

		public GraphicCard ProduceGraphicCard()
		{
			return new GraphicCard();
		}

		private Display ProduceDisplay()
		{
			return new Display();
		}

		private Keyboard ProduceKeyboard()
		{
			return new Keyboard();
		}

		private Mouse ProduceMouse()
		{
			return new Mouse();
		}
	}
}
