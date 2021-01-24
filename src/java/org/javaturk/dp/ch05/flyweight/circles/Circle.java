
package org.javaturk.dp.ch05.flyweight.circles;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * @author akin
 *
 */
public class Circle extends JComponent{
	private static Stroke solidStroke = new BasicStroke(5.0f);
	private static int numberOfAppearance;
	
	// Intrinsic state
	private Component canvas;
	
	// Extrinsic state
	private Point center;
	private Color color;
	private int radius;
	
	public Circle(int radius, Point center, Color color, Component canvas) {
		this.radius = radius;
		this.center = center;
		this.color = color;
		this.canvas = canvas;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void draw(Graphics2D g2) {
		g2.setColor(color);
		g2.setStroke(solidStroke);
		g2.drawArc(center.getX(), center.getY(), radius, radius, 0, 360);
	}

	public void showUp() {
		numberOfAppearance++;
		canvas.repaint();
	}

	public static int getNumberOfAppearance() {
		return numberOfAppearance;
	}

	/**
	 * @author akin
	
	 */
	public static void resetNumberOfAppearance() {
		numberOfAppearance = 0;		
	}
}
