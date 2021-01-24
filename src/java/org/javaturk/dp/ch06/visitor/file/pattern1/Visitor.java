package org.javaturk.dp.ch06.visitor.file.pattern1;

public interface Visitor {
	
	public boolean visit(TextFile file);
	
	public boolean visit(XMLFile file);

}
