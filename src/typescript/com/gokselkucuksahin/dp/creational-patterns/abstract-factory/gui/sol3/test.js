"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Test = void 0;
const client_1 = require("../sol2/client");
const win_factory_1 = require("./win-factory");
const osx_factory_1 = require("./osx-factory");
class Test {
    static main() {
        new client_1.Client(this.createOsSpecificFactory());
    }
    static createOsSpecificFactory() {
        const sys = this.readFromConfigFile("OS_TYPE");
        if (sys) {
            return new win_factory_1.WinFactory();
        }
        else {
            return new osx_factory_1.OSXFactory();
        }
    }
    static readFromConfigFile(file) {
        return Math.random() > 0.5;
    }
}
exports.Test = Test;
Test.main();
//# sourceMappingURL=test.js.map