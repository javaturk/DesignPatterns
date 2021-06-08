import {TurkishPowerSource} from "../domain/tr/turkish-power-source";
import {USPowerSource} from "../domain/us/us-power-source";

export class USTurkishPowerAdapter implements TurkishPowerSource {
  private on: boolean;
  private usPowerSource: USPowerSource;

  constructor(usPowerSource: USPowerSource) {
    console.log("\nUSTurkishPowerAdapter: Converting from USPowerSource to TurkishPowerSource");
    this.usPowerSource = usPowerSource;
  }

  providePowerAt220V(): void {
    this.usPowerSource.providePowerAt110V();
    this.convert110To220(this.usPowerSource);

  }

  turnOff(): void {
    if (this.on) {
      this.usPowerSource.pushSwitch();
      this.on = false;
    }
  }

  turnOn(): void {
    if (!this.on) {
      this.usPowerSource.pushSwitch();
      this.on = true;
    }
  }

  private convert110To220(usPowerSource: USPowerSource): void {
    console.log("USTurkishPowerAdapter: Converting from 110V to 220V");
  }
}