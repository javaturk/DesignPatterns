
package org.javaturk.dp.ch05.flyweight.circles;

import java.awt.Color;
import java.awt.Component;
import java.util.Random;

/**
 * @author akin
 *
 */
public class CircleFactory implements Factory {
	private static CircleFactory factory = new CircleFactory();
	private static Component canvas;
	private static Random random = new Random();

	private int width;
	private int height;

	@Override
	public Circle create() {
//		System.out.println("A new circle is created!");
		Circle circle = new Circle(produceRadius(), producePoint(), produceColor(), canvas);
		return circle;
	}

	public int produceRadius() {
		return 10 + 20 * random.nextInt(10);
	}

	public Point producePoint() {
		Point p = new Point(random.nextInt(width), random.nextInt(height));
		return p;
	}

	public Color produceColor() {
		int i = random.nextInt(10);
		Color color = null;
		switch (i) {
		case 0:
			color = Color.RED;
			break;

		case 1:
			color = Color.BLACK;
			break;

		case 2:
			color = Color.BLUE;
			break;

		case 3:
			color = Color.CYAN;
			break;

		case 4:
			color = Color.DARK_GRAY;
			break;

		case 5:
			color = Color.GRAY;
			break;

		case 6:
			color = Color.GREEN;
			break;

		case 7:
			color = Color.MAGENTA;
			break;

		case 8:
			color = Color.ORANGE;
			break;

		case 9:
			color = Color.PINK;
			break;
		}

		return color;
	}

	public void setWidthAndHeight(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public static CircleFactory getInstance() {
		return factory;
	}

	public static void setCanvas(CirclesCanvas canvas) {
		CircleFactory.canvas = canvas;
	}
}
