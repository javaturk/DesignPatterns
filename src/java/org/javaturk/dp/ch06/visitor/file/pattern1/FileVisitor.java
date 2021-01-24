package org.javaturk.dp.ch06.visitor.file.pattern1;

public class FileVisitor implements Visitor {

	@Override
	public boolean visit(TextFile file) {
		System.out.println("Checking the format of the file: " + file.getName());
		double random = Math.random();
		if (random < 0.80) {
			System.out.println("It is a formatted TXT file");
			return true;
		} else {
			System.out.println("It is not a formatted TXT file");
			return false;
		}
	}

	@Override
	public boolean visit(XMLFile file) {
		System.out.println(file.getName() + " is being validated.");
		double random = Math.random();
		if(random < 0.80){
			System.out.println("It is a valid XML file");
			return true;
		}
		else{
			System.out.println("It is not a valid XML file");
			return false;
		}
	}
}
