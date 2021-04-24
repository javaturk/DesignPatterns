"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Singleton = void 0;
class Singleton {
    constructor() {
        Singleton.count++;
    }
    say() {
        console.log("Singleton: ", Singleton.count);
    }
    static getInstance() {
        return Singleton.instance;
    }
}
exports.Singleton = Singleton;
Singleton.count = 0;
Singleton.init = (_ => {
    console.log("Singleton Object STATIC BLOCK\n" +
        "Singleton Object Instance initialized");
    Singleton.instance = new Singleton();
})();
//# sourceMappingURL=singleton.js.map