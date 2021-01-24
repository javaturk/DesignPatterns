package org.javaturk.dp.ch06.chainOfResponsibility.pattern;

public interface Handler {
	
	public Help handleRequest(Context context);
}
