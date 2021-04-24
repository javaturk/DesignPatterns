import {HR} from "../employee1/hr";
import {PayrollOffice} from "../employee1/payroll-office";
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
    hr.addNewEmployee(employeeFactory.create("Ali"));
    hr.addNewEmployee(employeeFactory.create("Ayşe"));
    hr.addNewEmployee(employeeFactory.create("Veli"));
    hr.addNewEmployee(managerFactory.create("Ece"));
    hr.addNewEmployee(managerFactory.create("Ahmet"));
    hr.addNewEmployee(directorFactory.create("Göksel"));

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