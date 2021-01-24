/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.image;

public class Document {


	public static void main(String[] args) {
		ImageChooser imageChooser = ImageChooser.getInstance();
		Image image = imageChooser.getImage();
		
		double chance = Math.random();
		if(chance > 0.9)
			image.draw();
	}
}
