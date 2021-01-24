package org.javaturk.dp.ch05.composite.graphic;


public abstract class GraphicObject implements Graphic{
	protected String name;
	protected String color;
	
	public GraphicObject(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Graphic Object: " + name + " Color: " + color;
	}
}
