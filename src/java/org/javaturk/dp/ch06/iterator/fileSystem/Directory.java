
package org.javaturk.dp.ch06.iterator.fileSystem;

import java.util.*;

import org.javaturk.dp.ch06.iterator.fileSystem.iterator.DirectoryIterator;

/**
 * @author akin
 *
 */
public class Directory extends StorageElement {
	List<Storage> elements = new ArrayList<>();

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
	}

	public void add(Storage element) {
		elements.add(element);
	}

	public void delete(Storage element) {
		elements.remove(element);
	}

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

	public List<Storage> elements() {
		return elements;
	}

	public DirectoryIterator<Storage> iterator() {
		DirectoryIterator<Storage> iterator = new DirectoryIterator<>(this);
		return iterator;
	}
}
