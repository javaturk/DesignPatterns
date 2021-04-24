"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LazyLoadSingleton = void 0;
class LazyLoadSingleton {
    constructor() {
        LazyLoadSingleton.count++;
    }
    static createInstance() {
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
    say() {
        console.log("Lazy Singleton: ", LazyLoadSingleton.count);
    }
}
exports.LazyLoadSingleton = LazyLoadSingleton;
LazyLoadSingleton.count = 0;
//# sourceMappingURL=lazyload-singleton.js.map