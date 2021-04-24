import {Employee} from "./employee";

export class HR {
  private employees: Employee[] = [];

  public getEmployees(): Employee[] {
    return this.employees;
  }

  public getNumberOfEmployees(): number {
    return this.employees.length;
  }

  public addNewEmployee(employee: Employee): void {
    this.employees.push(employee);
  }

  public listEmployees(): void {
    console.log("All Employees");
    this.employees.forEach(employee => {
      console.log(employee.toString());
    })
  }
}