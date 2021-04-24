"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DirectorFactory = void 0;
const director_1 = require("../employee1/director");
const employee_randomizer_1 = require("../employee-randomizer");
class DirectorFactory {
    create(name) {
        return new director_1.Director(employee_randomizer_1.EmployeeRandomizer.createId(), name, employee_randomizer_1.EmployeeRandomizer.createYear(), "Management", "Management", 5000);
    }
}
exports.DirectorFactory = DirectorFactory;
//# sourceMappingURL=director-factory.js.map