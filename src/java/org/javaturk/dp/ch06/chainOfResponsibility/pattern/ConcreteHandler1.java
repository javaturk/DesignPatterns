package org.javaturk.dp.ch06.chainOfResponsibility.pattern;

public class ConcreteHandler1 extends AbstractHandler {

	public ConcreteHandler1(Handler successor, Handler predecessor) {
		super(successor, predecessor);
		help = new Help1();
	}

	@Override
	public Help handleRequest(Context context) {
		if(context == Context.MORE_SPECIFIC)
			return help;
		else {
			Help successorHelp = successor.handleRequest(context);
			successorHelp.setOtherHelp(help);
			return successorHelp;
		}
	}
}
