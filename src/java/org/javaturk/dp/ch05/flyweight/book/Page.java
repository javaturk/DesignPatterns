package org.javaturk.dp.ch05.flyweight.book;

import java.util.ArrayList;
import java.util.List;

public class Page {
	private int no;
	private List<Line> lines;

	public Page(int no, int numberOfLine) {
		this.no = no;
		lines = new ArrayList<>(numberOfLine);
	}

	public void add(Line line) {
		lines.add(line);
	}

	public List<Line> getLines() {
		return lines;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Line line : lines) {
			sb.append(line.toString());
		}
		return sb.toString();
	}
}
