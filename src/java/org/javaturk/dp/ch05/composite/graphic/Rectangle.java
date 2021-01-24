package org.javaturk.dp.ch05.composite.graphic;

public class Rectangle extends GraphicObject {

	public Rectangle(String name, String color){
		super(name, color);
	}

	public void draw() {
		System.out.println("Drawing a rectangle: " + name);
	}

	public void erase() {
		System.out.println("Erasing a rectangle: " + name);
	}

	public void paint() {
		System.out.println("Painting a rectangle. : " + name + " and its color is " + color);
	}
}