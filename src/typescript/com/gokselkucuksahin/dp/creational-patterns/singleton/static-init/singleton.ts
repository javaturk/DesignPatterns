export class Singleton {
  private static count = 0;
  private static instance: Singleton;

  private static init = (_ => {
    console.log("Singleton Object STATIC BLOCK\n" +
        "Singleton Object Instance initialized");
    Singleton.instance = new Singleton();
  })();

  private constructor() {
    Singleton.count++;
  }

  say(): void {
    console.log("Singleton: ", Singleton.count);
  }

  static getInstance(): Singleton {
    return Singleton.instance;
  }
}