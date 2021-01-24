package org.javaturk.dp.ch05.facade.computer;

public class ROM {
	private int size;  // Size of ROM in MB
	
	public ROM(int size) {
		this.size = size;
	}

	public byte[] getOSKernelImage() {
		System.out.println("ROM: Loading the image of OS kernel.");
		byte[] kernelImage = new byte[2*1024*1024];
		
		// ...
		
		return kernelImage;
	}
}
