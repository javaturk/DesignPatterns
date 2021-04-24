"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Test = void 0;
const client_1 = require("./client");
const button_factory_1 = require("./button-factory");
const list_factory_1 = require("./list-factory");
const table_factory_1 = require("./table-factory");
class Test {
    static main() {
        new client_1.Client(new button_factory_1.ButtonFactory());
        new client_1.Client(new list_factory_1.ListFactory());
        new client_1.Client(new table_factory_1.TableFactory());
    }
}
exports.Test = Test;
Test.main();
//# sourceMappingURL=test.js.map