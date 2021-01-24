package org.javaturk.dp.ch06.memento.gui;

public class GuiComponent {
	private String name;
	private int x;
	private int y;
	private int length;
	private int width;
	
	private GuiComponentMemento memento;
	private GuiComponentState state;
	
	public GuiComponent(String name, int x, int y, int length, int width) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
		state = new GuiComponentState(x, y, length, width);
	}
	
	public void setMemento(GuiComponentMemento memento){
		this.memento = memento;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void saveState(){
		memento.setState(state);
	}
	
	public void undo(){
		state = memento.getState();
		x = state.getX();
		y = state.getY();
		length = state.getLength();
		width = state.getWidth();
	}

	@Override
	public String toString() {
		return "GuiComponent [name=" + name + ", x=" + x + ", y=" + y
				+ ", length=" + length + ", width=" + width + "]";
	}
}
