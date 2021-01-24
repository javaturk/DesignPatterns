/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch05.proxy.network;

public class ProxyServer implements Network {
	
	private Network gateway;
	
	public ProxyServer(){
		gateway = Gateway.getInstance();
	}
	
	public void ftp(String ip, String targetIp) throws YasakKardesimException{
		Logger.log(ip + ", " + targetIp + " adresine ftp yapmak istiyor");
		
		filter("ftp", ip, targetIp);
		
		gateway.ftp(ip, targetIp);
	}

	public void telnet(String ip, String targetIp) throws YasakKardesimException{
		Logger.log(ip + ", " + targetIp + " adresine telnet yapmak istiyor");
		
		filter("telnet", ip, targetIp);
		
		gateway.telnet(ip, targetIp);
	}
	
	private void filter(String protocol, String ip, String targetIp) throws YasakKardesimException{
		if(protocol.equals("ftp")){
			if(targetIp.startsWith("192"))
				throw new YasakKardesimException(targetIp + " adresine ftp yapmaniz yasaktir!");
		}
		
		if(protocol.equals("telnet")){
			if(ip.startsWith("10"))
				throw new YasakKardesimException(ip + " adresinden telnet yapmaniz yasaktir!");
		}
	}
}
