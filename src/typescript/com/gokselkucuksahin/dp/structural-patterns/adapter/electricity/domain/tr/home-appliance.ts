import {Appliance} from "./appliance";
import {TurkishPowerSource} from "./turkish-power-source";

export abstract class HomeAppliance implements Appliance {
  protected powerSource: TurkishPowerSource;

  setPowerSource(powerSource: TurkishPowerSource): void {
    this.powerSource = powerSource;
  }

  abstract start(): void;

  abstract stop(): void;
}