import {HR} from "./hr";
import {PayrollOffice} from "./payroll-office";
import {EmployeeFactory} from "./employee-factory";
import {ManagerFactory} from "./manager-factory";
import {DirectorFactory} from "./director-factory";

class Client {
  public static main = () => {
    const hr = new HR();
    const po = new PayrollOffice();

    const employeeFactory = new EmployeeFactory();
    const managerFactory = new ManagerFactory();
    const directorFactory = new DirectorFactory();

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
}
Client.main();