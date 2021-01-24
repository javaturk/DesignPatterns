package org.javaturk.dp.ch06.chainOfResponsibility.pattern;

public abstract class AbstractHandler implements Handler {
	protected Handler successor;
	protected Handler predecessor;
	protected Help help;
	
	public AbstractHandler(Handler successor, Handler predecessor) {
		this.successor = successor;
		this.predecessor = predecessor;
	}
}
