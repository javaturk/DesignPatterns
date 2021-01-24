package org.javaturk.dp.ch05.facade.computer;

public class BIOS {
	private ROM rom;
	
	public BIOS() {
		rom = new ROM(2*1024);
	}
	
	public void start() {
		System.out.println("BIOS: Getting the image of OS kernel.");
		rom.getOSKernelImage();
	}
}
