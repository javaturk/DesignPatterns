"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PayrollOffice = void 0;
class PayrollOffice {
    paySalary(employee) {
        const name = employee.getName();
        const department = employee.getDepartment();
        const salary = employee.getSalary();
        console.log(`Paying ${salary} to ${name} in ${department}`);
    }
}
exports.PayrollOffice = PayrollOffice;
//# sourceMappingURL=payroll-office.js.map