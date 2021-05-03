import {Line} from "./line";

export class Page {
  private no: number;
  private lines: Line[];

  constructor(no: number, numberOfLines: number) {
    this.no = no;
    this.lines = Array<Line>(numberOfLines);
  }

  add(line: Line): void {
    this.lines.push(line);
  }

  getLines(): Line[] {
    return this.lines;
  }

  toString(): string {
    return this.getLines().map(x => x.toString()).join('');
  }
}