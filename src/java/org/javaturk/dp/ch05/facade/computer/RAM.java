package org.javaturk.dp.ch05.facade.computer;

public class RAM {
	private BIOS bios;
	private boolean kernelLoaded = false;
	private boolean osLoaded = false;

	public RAM() {
		bios = new BIOS();
		double random = Math.random();
		if (random < 0.8) {
			kernelLoaded = true;
			osLoaded = true;
		}
	}

	public boolean loadOSKernelImage() {
		System.out.println("RAM: Loading the image of OS kernel.");
		if (kernelLoaded) {
			bios.start();
			System.out.println("RAM: Image of OS kernel has been loaded.");
		} else
			System.out.println("RAM: Image of OS kernel has been loaded.");
		return kernelLoaded;
	}

	public boolean loadOS() {
		if (osLoaded)
			System.out.println("OS has been loaded successfully.");
		else
			System.out.println("OS loading has been failed.");
		return osLoaded;
	}

	public void loadDrivers() {
		System.out.println("Drivers have been loaded.");
	}

	public void startServices() {
		System.out.println("Services have started.");
	}
	
	public void fixIt(){
		System.out.println("Fixing kernel and OS!");
		kernelLoaded = true;
		osLoaded = true;
	}
}
