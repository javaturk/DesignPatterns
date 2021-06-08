export interface Cloneable<T> {
  clone(): T;
}

export class Cloner {
  static deepClone(original: object): object {
    return JSON.parse(JSON.stringify(original));
  }

  static classInstanceClone(original: object): object {
    return Object.assign(Object.create(Object.getPrototypeOf(original)), original)
  }
}