import {Basbakan} from "./basbakan";

export class GercekBasbakan implements Basbakan {
  dertDinle(dert: string): void {
    console.log("Basbakan: Derdinizi dinliyorum...");
  }

  isBul(dert: string): void {
    console.log("Basbakan: Bana böyle isteklerle gelmeyin.")
  }
}