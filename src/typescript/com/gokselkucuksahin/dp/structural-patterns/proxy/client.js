"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const gercekbasbakan_1 = require("./gercekbasbakan");
const vatandas_1 = require("./vatandas");
const basbakanlikkalemi_1 = require("./basbakanlikkalemi");
const basbakan = new gercekbasbakan_1.GercekBasbakan();
const basbakanlikKalemi = new basbakanlikkalemi_1.BasbakanlikKalemi(basbakan);
const riza = new vatandas_1.Vatandas(basbakanlikKalemi);
riza.derdiniAnlat("Bir derdim var...");
riza.isIste("Oğlum...");
//# sourceMappingURL=client.js.map