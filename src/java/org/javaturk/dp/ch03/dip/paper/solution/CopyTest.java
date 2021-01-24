
package org.javaturk.dp.ch03.dip.paper.solution;

/**
 * @author akin
 *
 */
public class CopyTest {

	public static void main(String[] args) {
//		Reader in = new Keyboard();
//		Writer out = new Printer(); 
		
		Reader in = new FileReader("/Users/akin/Desktop/Siir.txt");
		Writer out = new FileWriter("/Users/akin/Desktop/SiirCopy2.txt"); 
		
		Copy copy = new Copy(in, out);
		copy.start();
	}
}
