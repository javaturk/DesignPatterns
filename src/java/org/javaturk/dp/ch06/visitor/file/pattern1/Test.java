package org.javaturk.dp.ch06.visitor.file.pattern1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private static List<File> files = new ArrayList();

	public static void main(String[] args) {

		File file  = null;
		Visitor visitor = new FileVisitor();
		
		for(int i = 0; i<3; i++){
			double random = Math.random();
			if(random < 0.5)
				file = new XMLFile("File-" + i + ".xml");
			else
				file = new TextFile("File-" + i + ".txt");
			files.add(file);
		}
		
		for(File aFile : files){
			aFile.open();
			boolean condition = aFile.accept(visitor);
			if(condition)
				aFile.read();
			aFile.close();
		}
	}
}
