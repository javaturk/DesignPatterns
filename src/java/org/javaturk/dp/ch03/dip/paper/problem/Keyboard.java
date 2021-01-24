
package org.javaturk.dp.ch03.dip.paper.problem;

import java.io.IOException;
import java.io.InputStream;

public class Keyboard {
	private InputStream input = System.in;
	
	public char read(){
		char ch = ' ';
		try {
			ch = (char) input.read();
		} catch (IOException e) {
			System.out.println("Problem while reading: " + e.getMessage());
		}
		return ch;
	}
}
