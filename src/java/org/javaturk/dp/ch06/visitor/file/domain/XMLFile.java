package org.javaturk.dp.ch06.visitor.file.domain;

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
}
