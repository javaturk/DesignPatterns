"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.WinFactory = void 0;
const win_button_1 = require("./win-button");
const win_list_1 = require("./win-list");
const win_table_1 = require("./win-table");
class WinFactory {
    createButton() {
        return new win_button_1.WinButton();
    }
    createList() {
        return new win_list_1.WinList();
    }
    createTable() {
        return new win_table_1.WinTable();
    }
}
exports.WinFactory = WinFactory;
//# sourceMappingURL=win-factory.js.map