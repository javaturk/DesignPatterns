"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DirectorFactory = void 0;
const director_1 = require("./director");
const employee_randomizer_1 = require("../employee-randomizer");
class DirectorFactory {
    create() {
        return new director_1.Director(employee_randomizer_1.EmployeeRandomizer.createId(), employee_randomizer_1.EmployeeRandomizer.createName(), employee_randomizer_1.EmployeeRandomizer.createYear(), "Management", "Management", 5000);
    }
}
exports.DirectorFactory = DirectorFactory;
//# sourceMappingURL=director-factory.js.map