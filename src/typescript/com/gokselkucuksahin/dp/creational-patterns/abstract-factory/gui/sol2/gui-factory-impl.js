"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GUIFactoryImpl = void 0;
const button_1 = require("../sol1/button");
const list_1 = require("../sol1/list");
const table_1 = require("../sol1/table");
class GUIFactoryImpl {
    createButton() {
        return new button_1.Button();
    }
    createList() {
        return new list_1.List();
    }
    createTable() {
        return new table_1.Table();
    }
}
exports.GUIFactoryImpl = GUIFactoryImpl;
//# sourceMappingURL=gui-factory-impl.js.map