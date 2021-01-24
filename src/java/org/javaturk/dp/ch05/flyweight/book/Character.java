package org.javaturk.dp.ch05.flyweight.book;

public class Character {
	// Intrinsic properties
	private char value;
	private boolean upperCase;

	// Extrinsic properties
	private Line line;
	private int position;

	public Character(char value, boolean upperCase) {
		this.value = value;
		this.upperCase = upperCase;
	}
	
	public Character(int value) {
		this.value = (char) value;
	}

	public char getValue() {
		return value;
	}
	
	public boolean isUpperCase() {
		return upperCase;
	}

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public String toString() {
		return String.valueOf(value);
	}
}
