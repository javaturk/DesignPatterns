package org.javaturk.dp.ch05.composite.graphic;

public class Triangle extends GraphicObject {

	public Triangle(String name, String color) {
		super(name, color);
	}

	public void draw() {
		System.out.println("Drawing a triangle: " + name);
	}

	public void erase() {
		System.out.println("Erasing a triangle: " + name);
	}

	public void paint() {
		System.out.println("Painting a triangle. : " + name + " and its color is " + color);
	}
}