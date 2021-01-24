/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.image;

public class ImageProxy implements Image {
	
	private BigImage bigImage;

	public void draw() {
		if(bigImage == null)
			bigImage = new BigImage();
		bigImage.draw();
	}

	public void erase() {
		bigImage.erase();
	}
}
