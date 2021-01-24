package org.javaturk.dp.ch06.chainOfResponsibility.pattern;

public class Test {

	public static void main(String[] args) {
		Handler handler1 = null;
		Handler handler2 = null;
		Handler handler3 = null;

		handler3 = new ConcreteHandler3(null, handler2);
		handler2 = new ConcreteHandler2(handler3, handler1);
		handler1 = new ConcreteHandler1(handler2, null);

		Help help = handler1.handleRequest(Context.MORE_SPECIFIC);
		help.show();

		System.out.println();
		
		help = handler1.handleRequest(Context.SPECIFIC);
		help.show();
		
		System.out.println();

		help = handler1.handleRequest(Context.GENERIC);
		help.show();
	}
}
