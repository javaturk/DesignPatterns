package org.javaturk.dp.ch06.chainOfResponsibility.pattern;

public class ConcreteHandler3 extends AbstractHandler {

	public ConcreteHandler3(Handler successor, Handler predecessor) {
		super(successor, predecessor);
		help = new Help3();
	}

	@Override
	public Help handleRequest(Context context) {
//		 Context.GENERIC
		return new Help3();
	}
}
