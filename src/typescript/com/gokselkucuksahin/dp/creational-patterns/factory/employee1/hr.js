"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.HR = void 0;
class HR {
    constructor() {
        this.employees = [];
    }
    getEmployees() {
        return this.employees;
    }
    getNumberOfEmployees() {
        return this.employees.length;
    }
    addNewEmployee(employee) {
        this.employees.push(employee);
    }
    listEmployees() {
        console.log("All Employees");
        this.employees.forEach(employee => {
            console.log(employee.toString());
        });
    }
}
exports.HR = HR;
//# sourceMappingURL=hr.js.map