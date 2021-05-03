import {USPowerSource} from "./us-power-source";

export class UsHomeAppliance {
  private readonly name: string;
  private usPowerSource: USPowerSource;

  constructor(name: string) {
    this.name = name;
  }

  setPowerSource(usPowerSource: USPowerSource) {
    this.usPowerSource = usPowerSource;
  }

  start(): void {
    console.log(`USHomeAppliance ${this.name} is turning on!`);
    this.usPowerSource.pushSwitch();
  }

  stop(): void {
    console.log(`USHomeAppliance ${this.name} turning off!`);
    this.usPowerSource.pushSwitch();
  }
}