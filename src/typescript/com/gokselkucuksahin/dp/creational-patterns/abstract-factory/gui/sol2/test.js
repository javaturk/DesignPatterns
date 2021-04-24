"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Test = void 0;
const client_1 = require("./client");
const gui_factory_impl_1 = require("./gui-factory-impl");
class Test {
    static main() {
        new client_1.Client(new gui_factory_impl_1.GUIFactoryImpl());
    }
}
exports.Test = Test;
Test.main();
//# sourceMappingURL=test.js.map