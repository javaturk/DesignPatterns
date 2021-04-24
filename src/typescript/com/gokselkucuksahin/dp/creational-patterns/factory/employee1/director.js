"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Director = void 0;
const manager_1 = require("./manager");
class Director extends manager_1.Manager {
    constructor(id, name, year, workingDepartment, managingDepartment, bonus) {
        super(id, name, year, workingDepartment, managingDepartment);
        this.bonus = bonus;
    }
    work() {
        console.log("Director is working!");
        this.manage();
    }
    manage() {
        console.log("Director manages whole company!");
        this.makeAStrategicPlan();
    }
    makeAStrategicPlan() {
        console.log("Director makes a strategic plan for the company!");
    }
    calculateSalary() {
        return super.calculateSalary() + this.bonus;
    }
    getBonus() {
        return this.bonus;
    }
    printInfo() {
        console.log("\nDirector Info");
        super.printInfo();
    }
    toString() {
        return `Director [bonus=${this.bonus}, departmentManaged=${this.departmentManaged}, id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
    }
}
exports.Director = Director;
//# sourceMappingURL=director.js.map