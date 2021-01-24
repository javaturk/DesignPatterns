
package org.javaturk.dp.ch05.composite.fileSystem;

/**
 * @author akin
 *
 */
public abstract class StorageElement implements Storage {
	protected String name;
	protected Storage parent;
	protected boolean directory;

	public StorageElement(String name, Storage parent) {
		this.name = name;
		this.parent = parent;
		if(parent != null)
			((Directory)parent).add(this);
	}

	@Override
	public void rename(String newName) {
		setName(newName);
	}

	@Override
	public void save() {
		System.out.println("Saving the element.");
	}

	@Override
	public void delete() {
		((Directory) parent).delete(this);
	}

	@Override
	public Storage copy() {
		StorageElement copiedElement = null;
		try {
			copiedElement = (StorageElement) clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Problem with copying: " + e.getMessage());
		}
		return copiedElement;
	}

	@Override
	public void move(Directory target) {
//		System.out.println("Moving the element to " + target);
		((Directory) parent).delete(this);
		target.add(this);
	}
	
	public boolean isDirectory(){
		return directory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Storage getParent() {
		return parent;
	}

	public void setParent(Storage parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return name;
	}
}
