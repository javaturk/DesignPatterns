package org.javaturk.dp.ch06.memento.gui;

public class GuiComponentState {
	private int x;
	private int y;
	private int length;
	private int width;
	
	public GuiComponentState(int x, int y, int length, int width) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
