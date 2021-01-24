package org.javaturk.dp.ch06.visitor.file.problem2;

import java.util.List;

public class FileOperator {
	
	public void operate(List<File> files) {
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
