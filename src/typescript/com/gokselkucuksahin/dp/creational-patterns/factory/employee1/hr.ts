import {Employee} from "./employee";

export class HR {
  private employees: Employee[] = [];

  getEmployees(): Employee[] {
    return this.employees;
  }

  getNumberOfEmployees(): number {
    return this.employees.length;
  }

  addNewEmployee(employee: Employee): void {
    this.employees.push(employee);
  }

  listEmployees(): void {
    console.log("All Employees");
    this.employees.forEach(employee => {
      console.log(employee.toString());
    })
  }
}