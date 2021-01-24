package org.javaturk.dp.ch04.abstractFactory.gui.sol1;

public class ButtonFactory implements GUIFactory {
	
	public Button create() {
		return new Button();
	}
}
