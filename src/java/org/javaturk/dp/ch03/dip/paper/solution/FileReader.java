
package org.javaturk.dp.ch03.dip.paper.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author akin
 *
 */
public class FileReader implements Reader {
	private File file;
	private java.io.FileReader input;

	public FileReader(String fileName) {
		file = new File(fileName);
		try {
			input = new java.io.FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}

	/**
	 * @author akin
	 * @return
	 * @see org.javaturk.dp.ch03.dip.paper.solution.Reader#read()
	 */
	@Override
	public char read() {
		char ch = ' ';
		try {
			int i = input.read();
			if (i == -1)
				ch = '0';
			else
				ch = (char) i;
				
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
			System.out.println("Problem when closing FileReader: " + e.getMessage());
		}
	}
}
