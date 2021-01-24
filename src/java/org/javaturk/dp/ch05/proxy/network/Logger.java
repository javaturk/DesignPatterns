/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.network;

import java.util.Date;

public class Logger {
	public static void log(String message){
		System.out.println("\n" + new Date() + ": " + message);
	}
}
