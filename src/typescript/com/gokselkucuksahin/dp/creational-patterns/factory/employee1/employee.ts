export class Employee {
  protected id: number;
  protected name: string;
  protected year: number;
  protected department: string;
  protected salary: number;

  static readonly BASE_SALARY: number = 500;

  constructor(id: number, name: string, year: number, department: string) {
    this.id = id;
    this.name = name;
    this.year = year;
    this.department = department;
    this.calculateSalary();
  }

  work(): void {
    console.log("Employee is working!");
  }

  calculateSalary(): number {
    this.salary = this.year * Employee.BASE_SALARY;
    return this.salary;
  }

  printInfo(): void {
    console.log(`
Employee Info
Id: ${this.id}
Name: ${this.name}
Year: ${this.year}
Department: ${this.department}`);
  }

  getId(): number {
    return this.id;
  }

  getName(): string {
    return this.name;
  }

  getYear(): number {
    return this.year;
  }

  getDepartment(): string {
    return this.department;
  }

  getSalary(): number {
    return this.salary;
  }

  toString(): string {
    return `Employee [id=${this.id}, name=${this.name}, year=${this.year}, department=${this.department}, salary=${this.salary}]`;
  }
}