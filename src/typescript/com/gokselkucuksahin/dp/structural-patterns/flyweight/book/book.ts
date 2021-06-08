import {Page} from "./page";
import {Character} from "./character";

export class Book {
  private bookName: string;
  private pages: Page[];
  private static endOfPage: Character = Character.character_1(String.fromCharCode(12));

  constructor(bookName: string, numberOfPages: number) {
    this.bookName = bookName;
    this.pages = Array<Page>(numberOfPages);
  }

  add(page: Page): void {
    this.pages.push(page);
  }

  getPages(): Page[] {
    return this.pages;
  }

  toString(): string {
    const str: string[] = [];
    this.pages.forEach(page => {
      str.push(page.toString());
      str.push(Book.endOfPage.toString());
    })
    return str.join('');
  }
}