package org.javaturk.dp.ch06.chainOfResponsibility.pattern;

public interface Help {
	void show();

	void setOtherHelp(Help otherHelp);
	
	Help getOtherHelp();
}
