
package org.javaturk.dp.ch03.dip.paper.solution;

/**
 * @author akin
 *
 */
public class Copy {
	private Reader in;
	private Writer out;
	
	/**
	 * @param in Reader object
	 * @param out Writer object
	 */
	public Copy(Reader in, Writer out) {
		this.in = in;
		this.out = out;
	}

	public void start(){
		System.out.println("Starting copying.");
		copy();
	}
	
	public void copy(){
		char ch = ' ';
		while((int)(ch = in.read()) != '0')
			out.write(ch);
		in.close();
		out.close();
		System.out.println("Stop copying.");
	}
}
