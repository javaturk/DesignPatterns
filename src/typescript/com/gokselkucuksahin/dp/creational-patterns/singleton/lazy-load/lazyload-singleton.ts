export class LazyLoadSingleton {

  private static count = 0;
  private static instance: LazyLoadSingleton;

  private static createInstance() {
    console.log("Lazy Load Singleton.\n" +
        "Singleton Instance created.");
    LazyLoadSingleton.instance = new LazyLoadSingleton();
  }

  static getInstance() {
    if (!LazyLoadSingleton.instance) {
      LazyLoadSingleton.createInstance();
    }
    return LazyLoadSingleton.instance;
  }

  say(): void {
    console.log("Lazy Singleton: ", LazyLoadSingleton.count);
  }

  private constructor() {
    LazyLoadSingleton.count++;
  }
}