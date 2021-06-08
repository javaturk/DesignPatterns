import {Manager} from "./manager";

export class Director extends Manager {
  protected bonus: number;

  constructor(id: number, name: string, year: number,
              workingDepartment: string, managingDepartment: string, bonus: number) {
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

  makeAStrategicPlan(): void {
    console.log("Director makes a strategic plan for the company!");
  }

  calculateSalary(): number {
    return super.calculateSalary() + this.bonus;
  }

  getBonus(): number {
    return this.bonus;
  }

  printInfo() {
    console.log("\nDirector Info");
    super.printInfo();
  }

  toString(): string {
    return `Director [bonus=${this.bonus}, departmentManaged=${this.departmentManaged}, id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
  }
}