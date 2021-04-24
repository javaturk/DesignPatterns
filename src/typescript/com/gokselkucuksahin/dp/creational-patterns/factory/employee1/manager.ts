import {Employee} from "./employee";

export class Manager extends Employee {
  protected departmentManaged: string;
  public static readonly MANAGEMENT_PAYMENT: number = 3000;

  public constructor(id: number, name: string, year: number, workingDepartment: string, departmentManaged: string) {
    super(id, name, year, workingDepartment);
    this.departmentManaged = departmentManaged;
  }

  public work(): void {
    console.log("Manager is working!");
    this.manage();
  }

  public manage(): void {
    console.log("Manager manages department:", this.departmentManaged);
  }

  public calculateSalary(): number {
    return super.calculateSalary() + Manager.MANAGEMENT_PAYMENT;
  }

  public getDepartmentManaged(): string {
    return this.departmentManaged;
  }

  public printInfo() {
    super.printInfo();
    console.log("Managing Department:", this.departmentManaged)
  }

  public toString(): string {
    return `Manager [departmentManaged=${this.departmentManaged}, id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
  }
}