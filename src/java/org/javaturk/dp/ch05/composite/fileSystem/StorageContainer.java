
package org.javaturk.dp.ch05.composite.fileSystem;

import java.util.List;

import org.javaturk.dp.ch05.composite.fileSystem.iterator.DirectoryIterator;

public interface StorageContainer {
	
	public void add(Storage element);
	
	public void delete(Storage element);
	
	public void list();
	
	public List<Storage> elements();
	
	public DirectoryIterator iterator();

}
