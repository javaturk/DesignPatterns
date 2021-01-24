package org.javaturk.dp.ch04.abstractFactory.gui.sol2;

import org.javaturk.dp.ch04.abstractFactory.gui.sol3.*;

public class Test {
    public static void main(String[] args) {
        new Client(new GUIFactoryImpl());
    }
}

