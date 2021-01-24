/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.image;

public class ImageChooser {
	
	private static ImageChooser ic = new ImageChooser();
	private Image image;
	
	public ImageChooser(){
		image = new ImageProxy();
	}
	
	Image getImage(){
		return image;
	}

	public static ImageChooser getInstance(){
		return ic;
	}
}
