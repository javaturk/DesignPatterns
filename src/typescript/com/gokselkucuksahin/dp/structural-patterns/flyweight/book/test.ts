import {Factory} from "./factory";
import {BookFactory} from "./book-factory";

export class Test {
  static main() {
    const factory: Factory = new BookFactory();

    // Line 1
    const line1 = factory.createLine(10);
    line1.add(factory.createCharacter('t', true));
    line1.add(factory.createCharacter('h', false));
    line1.add(factory.createCharacter('i', false));
    line1.add(factory.createCharacter('s', false));
    line1.add(factory.createCharacter(' ', false));
    line1.add(factory.createCharacter('b', false));
    line1.add(factory.createCharacter('o', false));
    line1.add(factory.createCharacter('o', false));
    line1.add(factory.createCharacter('k', false));
    line1.addEndOfLine();

    // Line 2
    const line2 = factory.createLine(20);
    line2.add(factory.createCharacter('G', true));
    line2.add(factory.createCharacter('ö', false));
    line2.add(factory.createCharacter('k', false));
    line2.add(factory.createCharacter('s', false));
    line2.add(factory.createCharacter('e', false));
    line2.add(factory.createCharacter('l', false));
    line2.add(factory.createCharacter(' ', false));
    line2.add(factory.createCharacter('h', false));
    line2.add(factory.createCharacter('e', false));
    line2.add(factory.createCharacter('l', false));
    line2.add(factory.createCharacter('l', false));
    line2.add(factory.createCharacter('o', false));
    line2.add(factory.createCharacter(' ', false));
    line2.add(factory.createCharacter('w', false));
    line2.add(factory.createCharacter('o', false));
    line2.add(factory.createCharacter('r', false));
    line2.add(factory.createCharacter('l', false));
    line2.add(factory.createCharacter('d', false));
    line2.add(factory.createCharacter('!', false));
    line2.addEndOfLine();

    // Page 1
    const page1 = factory.createPage(1, 20);
    page1.add(line1);
    page1.add(line2);

    // Book
    const book = factory.createBook("Thinking Desing Patterns", 349);
    book.add(page1);
    console.log(book.toString());
  }
}

Test.main();