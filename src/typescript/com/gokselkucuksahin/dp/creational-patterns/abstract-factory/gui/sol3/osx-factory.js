"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.OSXFactory = void 0;
const osx_button_1 = require("./osx-button");
const osx_list_1 = require("./osx-list");
const osx_table_1 = require("./osx-table");
class OSXFactory {
    createButton() {
        return new osx_button_1.OSXButton();
    }
    createList() {
        return new osx_list_1.OSXList();
    }
    createTable() {
        return new osx_table_1.OSXTable();
    }
}
exports.OSXFactory = OSXFactory;
//# sourceMappingURL=osx-factory.js.map