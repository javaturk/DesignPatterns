import {Basbakan} from "./basbakan";
import {Vekilbasbakan} from "./vekilbasbakan";

export class BasbakanlikKalemi {
  private readonly basbakan: Vekilbasbakan;

  constructor(basbakan: Basbakan) {
    this.basbakan = new Vekilbasbakan(basbakan);
  }

  public beniBasbakanaBagla(): Basbakan {
    console.log("Basbakanlik Kalemi: Sizi basbakana bağlıyorum...");
    return this.basbakan;
  }
}