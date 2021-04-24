"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Manager = void 0;
const employee_1 = require("./employee");
class Manager extends employee_1.Employee {
    constructor(id, name, year, workingDepartment, departmentManaged) {
        super(id, name, year, workingDepartment);
        this.departmentManaged = departmentManaged;
    }
    work() {
        console.log("Manager is working!");
        this.manage();
    }
    manage() {
        console.log("Manager manages department:", this.departmentManaged);
    }
    calculateSalary() {
        return super.calculateSalary() + Manager.MANAGEMENT_PAYMENT;
    }
    getDepartmentManaged() {
        return this.departmentManaged;
    }
    printInfo() {
        super.printInfo();
        console.log("Managing Department:", this.departmentManaged);
    }
    toString() {
        return `Manager [departmentManaged=${this.departmentManaged}, id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
    }
}
exports.Manager = Manager;
Manager.MANAGEMENT_PAYMENT = 3000;
//# sourceMappingURL=manager.js.map