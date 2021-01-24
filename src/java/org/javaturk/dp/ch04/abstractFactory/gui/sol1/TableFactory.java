package org.javaturk.dp.ch04.abstractFactory.gui.sol1;

public class TableFactory implements GUIFactory {

	@Override
	public Table create() {
		return new Table();
	}
}
