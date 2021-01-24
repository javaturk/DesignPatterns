/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.network;

public interface Network {
	public void telnet(String ip, String targetIp) throws YasakKardesimException;
	public void ftp(String ip, String targetIp) throws YasakKardesimException;
}
