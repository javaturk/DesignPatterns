package org.javaturk.dp.ch06.chainOfResponsibility.pattern;

public abstract class AbstractHelp implements Help {
	protected String description;
	protected Help otherHelp;

	public String getDescription() {
		return description;
	}

	@Override
	public void setOtherHelp(Help otherHelp) {
		this.otherHelp = otherHelp;
	}
	
	@Override
	public Help getOtherHelp() {
		return otherHelp;
	}

	@Override
	public void show() {
		System.out.println(description);
		if(otherHelp != null) {
			otherHelp.show();
			Help otherOtherHelp = otherHelp.getOtherHelp();
			if(otherOtherHelp != null)
				otherOtherHelp.show();
		}
	}
}
