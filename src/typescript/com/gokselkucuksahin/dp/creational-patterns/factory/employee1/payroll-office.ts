import {Employee} from "./employee";

export class PayrollOffice {
  public paySalary(employee: Employee): void {
    const name: string = employee.getName();
    const department: string = employee.getDepartment();
    const salary: number = employee.getSalary();
    console.log(`Paying ${salary} to ${name} in ${department}`);
  }
}