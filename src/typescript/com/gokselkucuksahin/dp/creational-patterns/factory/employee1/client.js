"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const hr_1 = require("./hr");
const payroll_office_1 = require("./payroll-office");
const employee_factory_1 = require("./employee-factory");
const manager_factory_1 = require("./manager-factory");
const director_factory_1 = require("./director-factory");
class Client {
}
Client.main = () => {
    const hr = new hr_1.HR();
    const po = new payroll_office_1.PayrollOffice();
    const employeeFactory = new employee_factory_1.EmployeeFactory();
    const managerFactory = new manager_factory_1.ManagerFactory();
    const directorFactory = new director_factory_1.DirectorFactory();
    // Add more employees
    hr.addNewEmployee(employeeFactory.create());
    hr.addNewEmployee(employeeFactory.create());
    hr.addNewEmployee(employeeFactory.create());
    hr.addNewEmployee(managerFactory.create());
    hr.addNewEmployee(managerFactory.create());
    hr.addNewEmployee(directorFactory.create());
    hr.listEmployees();
    console.log("~~~~");
    // Now pay time!
    const employees = hr.getEmployees();
    employees.forEach(employee => {
        po.paySalary(employee);
    });
    employees.forEach(employees => {
        employees.printInfo();
    });
};
Client.main();
//# sourceMappingURL=client.js.map