"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BasbakanlikKalemi = void 0;
const vekilbasbakan_1 = require("./vekilbasbakan");
class BasbakanlikKalemi {
    constructor(basbakan) {
        this.basbakan = new vekilbasbakan_1.Vekilbasbakan(basbakan);
    }
    beniBasbakanaBagla() {
        console.log("Basbakanlik Kalemi: Sizi basbakana bağlıyorum...");
        return this.basbakan;
    }
}
exports.BasbakanlikKalemi = BasbakanlikKalemi;
//# sourceMappingURL=basbakanlikkalemi.js.map