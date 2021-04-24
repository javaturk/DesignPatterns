export class Employee {
  protected id: number;
  protected name: string;
  protected year: number;
  protected department: string;
  protected salary: number;

  public static readonly BASE_SALARY: number = 500;

  public constructor(id: number, name: string, year: number, department: string) {
    this.id = id;
    this.name = name;
    this.year = year;
    this.department = department;
    this.calculateSalary();
  }

  public work(): void {
    console.log("Employee is working!");
  }

  public calculateSalary(): number {
    this.salary = this.year * Employee.BASE_SALARY;
    return this.salary;
  }

  public printInfo(): void {
    console.log(`
Employee Info
Id: ${this.id}
Name: ${this.name}
Year: ${this.year}
Department: ${this.department}`);
  }

  public getId(): number {
    return this.id;
  }

  public getName(): string {
    return this.name;
  }

  public getYear(): number {
    return this.year;
  }

  public getDepartment(): string {
    return this.department;
  }

  public getSalary(): number {
    return this.salary;
  }

  public toString(): string {
    return `Employee [id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
  }
}