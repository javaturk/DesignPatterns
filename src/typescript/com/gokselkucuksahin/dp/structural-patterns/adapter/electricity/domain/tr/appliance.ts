import {TurkishPowerSource} from "./turkish-power-source";

export interface Appliance {
  setPowerSource(powerSource: TurkishPowerSource): void;

  start(): void;

  stop(): void;

}