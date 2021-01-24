package org.javaturk.dp.ch05.composite.graphic;

public class Test {

	public static void main(String[] args) {
		CompositeGraphic display = new Canvas("Display", "Light Green");
		
		Circle redCircle = new Circle("Red Circle", "Red");
		display.addGraphic(redCircle);
		
		Circle blueCircle = new Circle("Blue Circle", "Blue");
		display.addGraphic(blueCircle);
		
		Ellipse ellipse = new Ellipse("Black Ellipse", "Black");
		display.addGraphic(ellipse);
		
		Triangle triangle = new Triangle("Triangle", "Yellow");
		display.addGraphic(triangle);
		
		Rectangle yellowRectangle = new Rectangle("Rectangle", "Yellow");
		display.addGraphic(yellowRectangle);
		
		Rectangle greenRectangle = new Rectangle("Rectangle", "Green");
		display.addGraphic(greenRectangle);
		
		display.listGraphic();
		
		Graphic graphic = (Graphic) display;
		graphic.draw();
		graphic.paint();
		
		System.out.println();
		
		Rectangle greenRectangle2 = new Rectangle("Rectangle2", "Green");
		greenRectangle2.draw();
	}

}
