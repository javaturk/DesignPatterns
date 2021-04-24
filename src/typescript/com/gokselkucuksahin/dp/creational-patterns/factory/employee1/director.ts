import {Manager} from "./manager";

export class Director extends Manager {
  protected bonus: number;

  public constructor(id: number, name: string, year: number,
                     workingDepartment: string, managingDepartment: string, bonus: number) {
    super(id, name, year, workingDepartment, managingDepartment);
    this.bonus = bonus;
  }

  public work() {
    console.log("Director is working!");
    this.manage();
  }

  public manage() {
    console.log("Director manages whole company!");
    this.makeAStrategicPlan();
  }

  public makeAStrategicPlan(): void {
    console.log("Director makes a strategic plan for the company!");
  }

  public calculateSalary(): number {
    return super.calculateSalary() + this.bonus;
  }

  public getBonus(): number {
    return this.bonus;
  }

  public printInfo() {
    console.log("\nDirector Info");
    super.printInfo();
  }

  public toString(): string {
    return `Director [bonus=${this.bonus}, departmentManaged=${this.departmentManaged}, id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
  }
}