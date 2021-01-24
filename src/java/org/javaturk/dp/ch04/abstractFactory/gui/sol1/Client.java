package org.javaturk.dp.ch04.abstractFactory.gui.sol1;

public class Client {
    public Client(GUIFactory factory){
        Component component = factory.create();
        component.paint();
    }
}