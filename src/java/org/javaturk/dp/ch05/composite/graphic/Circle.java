package org.javaturk.dp.ch05.composite.graphic;

public class Circle extends GraphicObject {
	
	public Circle(String name, String color) {
		super(name, color);
	}

	public void draw() {
		System.out.println("Drawing a cirle: " + name);
	}

	public void erase() {
		System.out.println("Erasing a circle: " + name);
	}

	public void paint() {
		System.out.println("Painting a circle. : " + name + " and its color is " + color);
	}
}
