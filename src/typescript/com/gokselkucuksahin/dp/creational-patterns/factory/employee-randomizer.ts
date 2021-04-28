export class EmployeeRandomizer {
  private static firstNames = ["Ali", "Ayse", "Bahar", "Bekir", "Bulent", "Can", "Cem", "Demet", "Elif",
    "Eylem", "Faruk", "Fatma", "Ganime", "Gulsum", "Haydar", "Halil", "Ismail", "Jale", "Kemal", "Leman",
    "Mehmet", "Mihrimah", "Murat", "Mustafa", "Nedim", "Nilufer", "Selim", "Selman", "Sevda", "Süleyman",
    "Tarik", "Teoman", "Turgut", "Yeliz", "Zuhal"];

  private static departments = ["Production", "Sales", "Marketing", "Engineering"];

  private static getRandomInt(min: number, max: number): number {
    return ~~(Math.random() * (max - min) + min);
  }

  static createId(): number {
    return this.getRandomInt(0, 100_000);
  }

  static createName(): string {
    const randomIndex = this.getRandomInt(0, this.firstNames.length);
    return this.firstNames[randomIndex];
  }

  static createDepartment(): string {
    const randomIndex = this.getRandomInt(0, this.departments.length);
    return this.departments[randomIndex];
  }

  static createYear(): number {
    return this.getRandomInt(1, 20);
  }
}