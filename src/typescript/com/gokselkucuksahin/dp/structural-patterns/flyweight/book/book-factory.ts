import {Factory} from "./factory";
import {Character} from "./character";
import {Book} from "./book";
import {Line} from "./line";
import {Page} from "./page";

export class BookFactory implements Factory {
  private as: Character[] = [];


  createCharacter(c: string, upperCase: boolean): Character {
    return Character.character_2(c, upperCase);
  }

  createLine(numberOfCharacters: number): Line {
    return new Line(numberOfCharacters);
  }

  createPage(no: number, numberOfLines: number): Page {
    return new Page(no, numberOfLines);
  }

  createBook(name: string, numberOfPages: number): Book {
    return new Book(name, numberOfPages);
  }

}