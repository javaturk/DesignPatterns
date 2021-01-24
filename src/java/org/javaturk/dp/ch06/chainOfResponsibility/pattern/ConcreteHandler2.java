package org.javaturk.dp.ch06.chainOfResponsibility.pattern;

public class ConcreteHandler2 extends AbstractHandler  {

	public ConcreteHandler2(Handler successor, Handler predecessor) {
		super(successor, predecessor);
		help = new Help2();
	}

	@Override
	public Help handleRequest(Context context) {
		if(context == Context.SPECIFIC)
			return help;
		else {
			Help successorHelp = successor.handleRequest(context);
			successorHelp.setOtherHelp(help);
			return successorHelp;
		}
	}
}
