import {TurkishPowerSource} from "../domain/tr/turkish-power-source";
import {USPowerSource} from "../domain/us/us-power-source";

export class USTurkishPowerAdapter implements TurkishPowerSource {
  private usPowerSource: USPowerSource;
  private on: boolean;

  constructor(usPowerSource: USPowerSource) {
    console.log("\nUSTurkishPowerAdapter: Converting from USPowerSource to TurkishPowerSource");
    this.usPowerSource = usPowerSource;
    this.convert110To220(usPowerSource);
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
    this.check();
    console.log("USTurkishPowerAdapter: Converting from 110V to 220V");
    this.regulateVoltage();
  }

  private check(): void {
    console.log("Making some safety checks.");
  }

  private regulateVoltage(): void {
    console.log("Regulating the voltage.");
  }

}