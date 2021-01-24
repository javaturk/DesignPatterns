package org.javaturk.dp.ch06.visitor.file.pattern1;

public class XMLFile extends File {

	public XMLFile(String name) {
		super(name);
	}

	@Override
	public void open() {
		System.out.println();
		System.out.println(name + " is opened.");
	}

	@Override
	public void read() {
		System.out.println(name + " is read.");
	}

	@Override
	public void close() {
		System.out.println(name + " is closed.");
	}
	
	@Override
	public boolean accept(Visitor visitor){
		return visitor.visit(this);
	}
}
