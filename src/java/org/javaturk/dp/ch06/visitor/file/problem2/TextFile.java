package org.javaturk.dp.ch06.visitor.file.problem2;

public class TextFile extends File {

	public TextFile(String name) {
		super(name);
	}

	@Override
	public void open() {
		System.out.println("\nOpening the file: " + name);
	}

	@Override
	public void read() {
		System.out.println("Reading the file: " + name);
	}

	@Override
	public void close() {
		System.out.println("Closing the file: " + name);
	}
	
	public boolean checkFormat() {
		System.out.println("Checking the format of the file: " + name);
		double random = Math.random();
		if(random < 0.80){
			System.out.println("It is a formatted TXT file");
			return true;
		}
		else{
			System.out.println("It is not a formatted TXT file");
			return false;
		}
	}
}
