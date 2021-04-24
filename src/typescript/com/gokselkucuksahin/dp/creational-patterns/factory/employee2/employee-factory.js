"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EmployeeFactory = void 0;
const employee_1 = require("../employee1/employee");
const employee_randomizer_1 = require("../employee-randomizer");
class EmployeeFactory {
    create(name) {
        return new employee_1.Employee(employee_randomizer_1.EmployeeRandomizer.createId(), name, employee_randomizer_1.EmployeeRandomizer.createYear(), employee_randomizer_1.EmployeeRandomizer.createDepartment());
    }
}
exports.EmployeeFactory = EmployeeFactory;
//# sourceMappingURL=employee-factory.js.map