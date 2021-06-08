import {Basbakan} from "./basbakan";

export class Vekilbasbakan implements Basbakan {
  private basbakan: Basbakan;

  constructor(basbakan: Basbakan) {
    this.basbakan = basbakan;
  }

  dertDinle(dert: string): void {
    console.log("Vakil: Derdinizi dinliyorum...");
    if (this.ayikla(dert)) {
      this.ilet(dert);
    }
  }

  isBul(dert: string): void {
    console.log("Vekil: Isteğinizi dinliyorum...");
  }

  private ayikla(dert: string): boolean {
    return dert.length > 10;
  }

  private ilet(dert: string) {
    this.basbakan.dertDinle(dert);
  }
}