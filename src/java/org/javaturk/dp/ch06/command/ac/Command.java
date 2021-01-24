package org.javaturk.dp.ch06.command.ac;

public interface Command {
	
	public void execute(Temperature temperature);
	
	public void undo();
	
	public void redo();
}
