export class Person {
  private name: string;
  private surname: string;
  private tckn: number;
  private phoneNumber: number;
  private height: number;
  private weight: number;

  getAllData() {
    console.log(this.name, this.surname, this.tckn, this.phoneNumber, this.height, this.weight);
  }
}