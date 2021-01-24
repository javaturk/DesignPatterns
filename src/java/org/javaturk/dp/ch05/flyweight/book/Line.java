package org.javaturk.dp.ch05.flyweight.book;

import java.util.ArrayList;
import java.util.List;

public class Line {
	private List<Character> chars;
	private static Character endOfLine = new Character('\n');
	private int emptyPosition;
	private boolean full;
	private int numberOfCharacters = 1;

	public Line(int numberOfCharacters) {
		this.numberOfCharacters = numberOfCharacters;
		chars = new ArrayList<>(numberOfCharacters);
	}

	public boolean add(Character character) {
		if (!full) {
			chars.add(character);
			character.setLine(this);
			character.setPosition(emptyPosition);
			emptyPosition++;
			if(emptyPosition == numberOfCharacters + 1)
				full = true;
			return true;
		} else
			return false;
	}

	public void addEndOfLine() {
		chars.add(endOfLine);
	}

	public List<Character> getChars() {
		return chars;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Character character : chars)
			sb.append(character.getValue());
		return sb.toString();
	}
}
