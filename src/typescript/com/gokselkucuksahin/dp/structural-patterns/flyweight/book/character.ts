import {Line} from "./line";

export class Character {
  // Intrinsic properties
  private _value: string;
  private _upperCase: boolean;

  // Extrinsic properties
  private _line: Line;
  private _position: number;

  private constructor(value: string) {
    this._value = value;
  }

  static character_1(value: string) {
    return new Character(value);
  }

  static character_2(value: string, upperCase: boolean) {
    const char = new Character(value);
    char._upperCase = upperCase;
    return char;
  }

  get value(): string {
    return this._value;
  }

  set value(value: string) {
    this._value = value;
  }

  get upperCase(): boolean {
    return this._upperCase;
  }

  set upperCase(value: boolean) {
    this._upperCase = value;
  }

  get line(): Line {
    return this._line;
  }

  set line(value: Line) {
    this._line = value;
  }

  get position(): number {
    return this._position;
  }

  set position(value: number) {
    this._position = value;
  }

  toString(): string {
    return this.value.valueOf().normalize().toString();
  }
}