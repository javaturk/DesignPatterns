package org.javaturk.dp.ch05.composite.graphic;

public class Ellipse extends GraphicObject {

	public Ellipse(String name, String color) {
		super(name, color);
	}

	public void draw() {
		System.out.println("Drawing an ellipse: " + name);
	}

	public void erase() {
		System.out.println("Erasing an ellipse: " + name);
	}

	public void paint() {
		System.out.println("Painting an ellipse. : " + name + " and its color is " + color);
	}
}
