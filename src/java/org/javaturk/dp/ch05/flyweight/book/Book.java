package org.javaturk.dp.ch05.flyweight.book;

import java.util.ArrayList;
import java.util.List;

import org.javaturk.dp.ch04.builder.computer4.Computer;
import org.javaturk.dp.ch04.builder.computer4.ComputerBuilderI;
import org.javaturk.dp.ch04.builder.computer4.Computer.ComputerBuilder;

public class Book {
	private String bookName;
	private List<Page> pages;
	private static Character endOfPage = new Character(12);

	public Book(String bookName, int numberOfPages) {
		this.bookName = bookName;
		pages = new ArrayList<>(numberOfPages);
	}

	public void add(Page page) {
		pages.add(page);
	}

	public List<Page> getPages() {
		return pages;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Page page : pages) {
			sb.append(page.toString());
			sb.append(endOfPage.toString());
		}
		return sb.toString();
	}
}
