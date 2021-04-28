import {Employee} from "./employee";

export class Manager extends Employee {
  protected departmentManaged: string;
  static readonly MANAGEMENT_PAYMENT: number = 3000;

  constructor(id: number, name: string, year: number, workingDepartment: string, departmentManaged: string) {
    super(id, name, year, workingDepartment);
    this.departmentManaged = departmentManaged;
  }

  work(): void {
    console.log("Manager is working!");
    this.manage();
  }

  manage(): void {
    console.log("Manager manages department:", this.departmentManaged);
  }

  calculateSalary(): number {
    return super.calculateSalary() + Manager.MANAGEMENT_PAYMENT;
  }

  getDepartmentManaged(): string {
    return this.departmentManaged;
  }

  printInfo() {
    super.printInfo();
    console.log("Managing Department:", this.departmentManaged)
  }

  toString(): string {
    return `Manager [departmentManaged=${this.departmentManaged}, id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
  }
}