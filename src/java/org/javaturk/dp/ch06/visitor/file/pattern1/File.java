package org.javaturk.dp.ch06.visitor.file.pattern1;

public abstract class File {
	protected String name;
	
	public File(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract boolean accept(Visitor visitor);
	
	public abstract void open();
	
	public abstract void read();
	
	public abstract void close();

}
