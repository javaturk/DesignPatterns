
package org.javaturk.dp.ch06.iterator.fileSystem;

/**
 * @author akin
 *
 */
public interface Storage {
	
	public void rename(String newName);
	
	public void save();
	
	public void delete();

	public Storage copy();

	public void move(Directory target);
}
