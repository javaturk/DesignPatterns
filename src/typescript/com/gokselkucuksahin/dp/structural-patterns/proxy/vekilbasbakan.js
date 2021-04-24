"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Vekilbasbakan = void 0;
class Vekilbasbakan {
    constructor(basbakan) {
        this.basbakan = basbakan;
    }
    dertDinle(dert) {
        console.log("Vakil: Derdinizi dinliyorum...");
        if (this.ayikla(dert)) {
            this.ilet(dert);
        }
    }
    isBul(dert) {
        console.log("Vekil: Isteğinizi dinliyorum...");
    }
    ayikla(dert) {
        return dert.length > 10;
    }
    ilet(dert) {
        this.basbakan.dertDinle(dert);
    }
}
exports.Vekilbasbakan = Vekilbasbakan;
//# sourceMappingURL=vekilbasbakan.js.map