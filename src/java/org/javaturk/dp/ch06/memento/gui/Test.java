package org.javaturk.dp.ch06.memento.gui;

public class Test {

	public static void main(String[] args) {
		GuiComponent window = new GuiComponent("window", 0, 0, 20, 10);
		
		System.out.println(window);
		
		window.setMemento(new GuiComponentMemento());
		window.saveState();
		
		window.setX(20);
		window.setLength(40);
		System.out.println(window);
		
		window.undo();
		System.out.println(window);

	}

}
