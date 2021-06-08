import {Character} from "./character";

export class Line {
  private chars: Character[];
  private static endOfLine: Character = Character.character_1('\n');
  private emptyPosition: number;
  private full: boolean;
  private numberOfCharacters: number = 1;

  constructor(numberOfCharacters: number) {
    this.numberOfCharacters = numberOfCharacters;
    this.chars = Array<Character>(numberOfCharacters);
  }

  add(character: Character): boolean {
    if (!this.full) {
      this.chars.push(character);
      character.line = this;
      character.position = this.emptyPosition;
      this.emptyPosition++;
      if (this.emptyPosition == this.numberOfCharacters + 1) {
        this.full = true;
      }
      return true;
    } else {
      return false;
    }
  }

  addEndOfLine(): void {
    this.chars.push(Line.endOfLine);
  }

  getChars(): Character[] {
    return this.chars;
  }

  toString(): string {
    return this.getChars().map(x => x.toString()).join('');
  }
}