using System;
namespace Domain
{
    public class Computer
    {
		public string name { set; get; }
		public CPU cpu { set; get; }
		public RAM ram { set; get; }
		public HardDrive hd { set; get; }
		public GraphicCard graphicCard { set; get; }
		public Display display { set; get; }
	    public Keyboard keyboard { set; get; }
		public Mouse mouse { set; get; }

		public Computer() { }

		public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard)
		{
			this.name = name;
			this.cpu = cpu;
			this.ram = ram;
			this.hd = hd;
			this.graphicCard = graphicCard;
		}

		public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display)
		{
			this.name = name;
			this.cpu = cpu;
			this.ram = ram;
			this.hd = hd;
			this.graphicCard = graphicCard;
			this.display = display;
		}

		public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard,
				Display display, Keyboard keyboard)
		{
			this.name = name;
			this.cpu = cpu;
			this.ram = ram;
			this.hd = hd;
			this.graphicCard = graphicCard;
			this.display = display;
			this.keyboard = keyboard;
		}

        public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard,
				Display display, Keyboard keyboard, Mouse mouse)
		{
			this.name = name;
			this.cpu = cpu;
			this.ram = ram;
			this.hd = hd;
			this.graphicCard = graphicCard;
			this.display = display;
			this.keyboard = keyboard;
			this.mouse = mouse;
		}

		public void Start()
		{
			cpu.Start();
			ram.LoadOSKernelImage();
			ram.LoadOS();
			ram.LoadDrivers();
			ram.StartServices();
			hd.Start();
			graphicCard.Start();
			if (display != null)
				display.Start();
			if (keyboard != null)
				keyboard.Start();
			if (mouse != null)
				mouse.Start();
			Console.WriteLine("Computer " + name + " has started.\n");
		}
	}
}
