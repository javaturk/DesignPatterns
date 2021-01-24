package org.javaturk.dp.ch04.abstractFactory.gui.sol2;

interface GUIFactory {

	public Component createButton();

	public Component createList();

	public Component createTable();
}
