package org.javaturk.dp.ch05.flyweight.book;

public class Test {

	public static void main(String[] args) {
		Factory factory = new BookFactory();
		// Page 1
		Line line1 = factory.createLine(10);
		Character c1 = factory.createCharacter('t', true);
		line1.add(c1);
		Character c2 = factory.createCharacter('h', false);
		line1.add(c2);
		Character c3 = factory.createCharacter('i', false);
		line1.add(c3);
		Character c4 = factory.createCharacter('s', false);
		line1.add(c4);
		Character c5 = factory.createCharacter(' ', false);
		line1.add(c5);
		Character c6 = factory.createCharacter('b', false);
		line1.add(c6);
		Character c7 = factory.createCharacter('o', false);
		line1.add(c7);
		Character c8 = factory.createCharacter('o', false);
		line1.add(c8);
		Character c9 = factory.createCharacter('k', false);
		line1.add(c9);
		line1.addEndOfLine();
		
		Page page1 = factory.createPage(1, 20);
		page1.add(line1);
		
		Book book = factory.createBook("Thinking Design Patterns", 349);
		book.add(page1);
		System.out.println(book);
	}
}
