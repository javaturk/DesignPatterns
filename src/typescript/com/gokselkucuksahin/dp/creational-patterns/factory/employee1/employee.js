"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = void 0;
class Employee {
    constructor(id, name, year, department) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.department = department;
        this.calculateSalary();
    }
    work() {
        console.log("Employee is working!");
    }
    calculateSalary() {
        this.salary = this.year * Employee.BASE_SALARY;
        return this.salary;
    }
    printInfo() {
        console.log(`
Employee Info
Id: ${this.id}
Name: ${this.name}
Year: ${this.year}
Department: ${this.department}`);
    }
    getId() {
        return this.id;
    }
    getName() {
        return this.name;
    }
    getYear() {
        return this.year;
    }
    getDepartment() {
        return this.department;
    }
    getSalary() {
        return this.salary;
    }
    toString() {
        return `Employee [id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
    }
}
exports.Employee = Employee;
Employee.BASE_SALARY = 500;
//# sourceMappingURL=employee.js.map