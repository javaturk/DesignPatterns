/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.network;

public class NetworkServer {
	
	private static NetworkServer ns = new NetworkServer();
	private Network network;
	
	private NetworkServer(){
		network = new ProxyServer();
	}
	
	public Network getNetwork(){
		return network;
	}
	
	public static NetworkServer getInstance(){
		return ns;
	}
}
