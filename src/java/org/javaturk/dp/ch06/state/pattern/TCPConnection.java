package org.javaturk.dp.ch06.state.pattern;

public interface TCPConnection {
	
	void open();
	
	void close();
	
	void acknowledge();

}
