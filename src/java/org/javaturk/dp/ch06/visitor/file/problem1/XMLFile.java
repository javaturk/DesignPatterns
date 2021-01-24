package org.javaturk.dp.ch06.visitor.file.problem1;

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
	
	public boolean validate() {
		System.out.println(name + " is being validated.");
		double random = Math.random();
		if(random < 0.80){
			System.out.println("It is a valid XML file");
			return true;
		}
		else{
			System.out.println("It is not a valid XML file");
			return false;
		}
	}
}
