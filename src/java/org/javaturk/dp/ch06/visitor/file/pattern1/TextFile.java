package org.javaturk.dp.ch06.visitor.file.pattern1;

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
	
	@Override
	public boolean accept(Visitor visitor){
		return visitor.visit(this);
	}

}
