package org.javaturk.dp.ch04.abstractFactory.gui.sol3;

public class WinFactory implements GUIFactory {
    public Component createButton() {
        return new WinButton();
    }

	@Override
	public Component createList() {
		return new WinList();
	}

	@Override
	public Component createTable() {
		return new WinTable();
	}
}
