package org.javaturk.dp.ch03.lsp.square;

public class Rectangle {
	protected int shortSide;
	protected int longSide;
	
	public Rectangle() {

	}
	
	public Rectangle(int shortSide, int longSide) {
		this.shortSide = shortSide;
		this.longSide = longSide;
	}
	
	public double calculateArea() {
		return shortSide * longSide;
	}
	
	public double calculateCircumference() {
		return 2 * (shortSide + longSide);
	}

	public int getShortSide() {
		return shortSide;
	}
	
	public void setShortSide(int shortSide) {
		this.shortSide = shortSide;
	}

	public int getLongSide() {
		return longSide;
	}

	public void setLongSide(int longSide) {
		this.longSide = longSide;
	}
}
