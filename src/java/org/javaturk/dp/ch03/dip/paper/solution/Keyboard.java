
package org.javaturk.dp.ch03.dip.paper.solution;

import java.io.IOException;
import java.io.InputStream;

public class Keyboard implements Reader{
	private InputStream input = System.in;
	
	@Override
	public char read(){
		char ch = ' ';
		try {
			ch = (char) input.read();
		} catch (IOException e) {
			System.out.println("Problem while reading: " + e.getMessage());
		}
		return ch;
	}

	@Override
	public void close() {
		try {
			input.close();
		} catch (IOException e) {
			System.out.println("Problem when closing Keyboard: " + e.getMessage());
		}
	}
}
