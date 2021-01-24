
package org.javaturk.dp.ch03.dip.paper.problem;

import org.javaturk.dp.ch03.dip.paper.solution.Reader;
import org.javaturk.dp.ch03.dip.paper.solution.Writer;

/**
 * @author akin
 *
 */
public class Copy {
	private Keyboard in;
	private Printer out;
	
	public Copy(Keyboard in, Printer out) {
		this.in = in;
		this.out = out;
	}
	
	public void start(){
		System.out.println("Starting copying.");
		copy();
	}
	
	public void copy(){
		char ch = ' ';
		while((ch = in.read()) != -1)
			out.write(ch);
		System.out.println("Stop copying.");
	}
}
