import {Character} from "./character";
import {Line} from "./line";
import {Page} from "./page";
import {Book} from "./book";

export interface Factory {
  createCharacter(c: string, upperCase: boolean): Character;

  createLine(numberOfCharacters: number): Line;

  createPage(no: number, numberOfLines: number): Page;

  createBook(name: string, numberOfPages: number): Book;
}