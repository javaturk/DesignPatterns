/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.network;

public class NetworkClient {

	public static void main(String[] args) {
		NetworkServer networkServer = NetworkServer.getInstance();
		
		Network network = networkServer.getNetwork();

		String myIp = "10.0.0.2";
		try {
			network.telnet(myIp, "88.168.2.200");
		} catch (YasakKardesimException e) {
			System.out.println(e.getMessage());
		}

		try {
			network.ftp(myIp, "192.168.2.200");
		} catch (YasakKardesimException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			network.ftp(myIp, "202.168.2.200");
		} catch (YasakKardesimException e) {
			System.out.println(e.getMessage());
		}
	}
}
