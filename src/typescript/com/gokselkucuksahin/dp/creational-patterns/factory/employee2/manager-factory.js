"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ManagerFactory = void 0;
const manager_1 = require("../employee1/manager");
const employee_randomizer_1 = require("../employee-randomizer");
class ManagerFactory {
    create(name) {
        const department = employee_randomizer_1.EmployeeRandomizer.createDepartment();
        return new manager_1.Manager(employee_randomizer_1.EmployeeRandomizer.createId(), name, employee_randomizer_1.EmployeeRandomizer.createYear(), department, department);
    }
}
exports.ManagerFactory = ManagerFactory;
//# sourceMappingURL=manager-factory.js.map