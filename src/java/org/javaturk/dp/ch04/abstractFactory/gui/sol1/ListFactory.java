package org.javaturk.dp.ch04.abstractFactory.gui.sol1;

public class ListFactory implements GUIFactory {

	@Override
	public List create() {
		return new List();
	}

}
