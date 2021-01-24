package org.javaturk.dp.ch06.templateMethod.pattern;

import java.util.*;

public abstract class Application {
	private List<Document> documents = new ArrayList<>();

	void openDocument(String fileName) {
		if (canOpenDocument(fileName)) {
			Document doc = createDocument(fileName);
			addDocument(doc);
		}
	}

	abstract boolean canOpenDocument(String fileName);
	
	abstract Document createDocument(String fileName);
	
	void addDocument(Document doc) {
		documents.add(doc);
	}
}