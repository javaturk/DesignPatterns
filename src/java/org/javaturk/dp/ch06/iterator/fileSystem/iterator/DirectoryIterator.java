
package org.javaturk.dp.ch06.iterator.fileSystem.iterator;

import java.util.Iterator;
import java.util.List;

import org.javaturk.dp.ch06.iterator.fileSystem.Directory;

public class DirectoryIterator<Storage> implements Iterator<Storage> {
	private Directory dir;
	private List<Storage> elements;
	private Iterator<Storage> iterator;
	
	public DirectoryIterator(Directory dir){
		this.dir = dir;
		elements = (List<Storage>) dir.elements();
		iterator = elements.iterator();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Storage next() {
		return iterator.next();
	}
}
