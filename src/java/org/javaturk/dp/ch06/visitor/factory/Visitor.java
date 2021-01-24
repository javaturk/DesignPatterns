package org.javaturk.dp.ch06.visitor.factory;

public interface Visitor {
	
	public void visit(Employee employee);

	public void visit(Boss boss);

}
