/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.image;

public class BigImage implements Image {

	public void draw() {
		System.out.println("Drawing the big image");
	}

	public void erase() {
		System.out.println("Erasing the big image");
	}
}
