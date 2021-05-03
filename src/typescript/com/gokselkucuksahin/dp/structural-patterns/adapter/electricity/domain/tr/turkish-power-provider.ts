import {TurkishPowerSource} from "./turkish-power-source";

export class TurkishPowerProvider implements TurkishPowerSource {
  constructor() {
    console.log("TurkishPowerProvider is up and running.");
  }

  providePowerAt220V(): void {
    console.log("I provide electricity at 220V. Be careful, there may be some casual interruptions!");
  }

  turnOff(): void {
    console.log("TurkishPowerProvider stopped to provide electricity.");
  }

  turnOn(): void {
    console.log("TurkishPowerProvider started to provide electricity.");
  }

}