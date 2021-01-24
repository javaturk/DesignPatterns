package org.javaturk.dp.ch05.facade.computer;

public class Computer {
	private CPU cpu;
	private RAM ram;
	private HardDrive hd;
	private Display display;

	public Computer() {
		cpu = new CPU();
		ram = new RAM();
		hd = new HardDrive();
		display = new Display();
	}
	
	public void start() {
		cpu.start();
		hd.start();
		boolean kernelLoaded = ram.loadOSKernelImage();
		while(!kernelLoaded){
			ram.fixIt();
			kernelLoaded = ram.loadOSKernelImage();
		}
		
		boolean osLoaded = ram.loadOS();
		while(!osLoaded){
			ram.fixIt();
			osLoaded = ram.loadOS();
		}
		
		ram.loadDrivers();
		ram.startServices();
		display.start();
		System.out.println("Computer has started.");
	}
}
