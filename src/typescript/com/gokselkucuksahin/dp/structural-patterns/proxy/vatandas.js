"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Vatandas = void 0;
class Vatandas {
    constructor(kalem) {
        this.kalem = kalem;
    }
    isIste(istek) {
        this.kalem.beniBasbakanaBagla().isBul(istek);
        console.log("Oley!!!");
    }
    derdiniAnlat(dert) {
        this.kalem.beniBasbakanaBagla().dertDinle(dert);
        console.log("Basbakan vatandası dinledi");
    }
}
exports.Vatandas = Vatandas;
//# sourceMappingURL=vatandas.js.map