import {BasbakanlikKalemi} from "./basbakanlikkalemi";

export class Vatandas {
  private kalem: BasbakanlikKalemi;

  constructor(kalem: BasbakanlikKalemi) {
    this.kalem = kalem;
  }

  public isIste(istek: string): void {
    this.kalem.beniBasbakanaBagla().isBul(istek);
    console.log("Oley!!!");
  }

  public derdiniAnlat(dert: string): void {
    this.kalem.beniBasbakanaBagla().dertDinle(dert);
    console.log("Basbakan vatandası dinledi");
  }
}