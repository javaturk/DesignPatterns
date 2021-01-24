package org.javaturk.dp.ch06.visitor.file.problem1;

import java.util.ArrayList;
import java.util.List;

import org.javaturk.dp.ch06.visitor.file.*;

public class Test {
	private static List<File> files = new ArrayList<File>();

	public static void main(String[] args) {

		File file  = null;
		
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
			if(aFile instanceof XMLFile){
				XMLFile xmlFile = (XMLFile) aFile;
				boolean valid = xmlFile.validate();
				if(valid){
					xmlFile.read();
				}
			}
			else{
				TextFile textFile = (TextFile) aFile;
				boolean formatted = textFile.checkFormat();
				if(formatted){
					textFile.read();
				}
			}
			aFile.close();
		}
	}

}
