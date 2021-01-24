package org.javaturk.dp.ch06.state.pattern;

public interface TCPState {
	
	void open();

	void close();

	void acknowledge();

}
