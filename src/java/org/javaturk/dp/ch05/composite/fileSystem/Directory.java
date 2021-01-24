
package org.javaturk.dp.ch05.composite.fileSystem;

import java.util.*;

import org.javaturk.dp.ch05.composite.fileSystem.iterator.DirectoryIterator;

/**
 * @author akin
 *
 */
public class Directory extends StorageElement implements StorageContainer {
	List<Storage> elements = new ArrayList<Storage>();

	public Directory(String name) {
		super(name, null);
		directory = true;
	}

	public Directory(String name, StorageElement parent) {
		super(name, parent);
		directory = true;
	}

	@Override
	public Storage copy() {
		Storage copiedElement = null;
		try {
			copiedElement = (Storage) clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Problem with copying: " + e.getMessage());
		}
		return copiedElement;
	}

	@Override
	public void move(Directory target) {
		parent = target;
		target.add(this);
//		int size = elements.size();
//		Storage[] elementsCopy = new Storage[size];
//		elements.toArray(elementsCopy);
//		// First remove them from the existing dir
//		Iterator iterator = elements.iterator();
//		while(iterator.hasNext()){
//			iterator.next();
//			iterator.remove();
//		}
//			
////		for (Storage element : elements) {
////			((Directory) ((StorageElement) element).getParent()).delete(element);
////		}
//		
//		//Then add them to target dir
//		for(Storage element : elementsCopy)
//			target.add(element);
	}

	@Override
	public void add(Storage element) {
		elements.add(element);
	}

	@Override
	public void delete(Storage element) {
		elements.remove(element);
	}

	@Override
	public void list() {
		System.out.println("\nList of the directory: " + name);
		for (Storage element : elements) {
			StorageElement storageElement = (StorageElement) element;
			if (storageElement.isDirectory())
				System.out.format("%-20s %10s %s", storageElement, "dir", '\n');
			else
				System.out.format("%-20s %s", storageElement, '\n');
		}
	}

	@Override
	public List<Storage> elements() {
		return elements;
	}

	@Override
	public DirectoryIterator iterator() {
		DirectoryIterator iterator = new DirectoryIterator(this);
		return iterator;
	}
}
