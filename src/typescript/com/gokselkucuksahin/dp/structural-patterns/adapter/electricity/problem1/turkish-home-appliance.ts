import {TurkishPowerSource} from "../domain/tr/turkish-power-source";
import {USPowerSource} from "../domain/us/us-power-source";
import {HomeAppliance} from "../domain/tr/home-appliance";

export class TurkishHomeAppliance extends HomeAppliance {
  private readonly name: string;
  private usPowerSource: USPowerSource;
  private turkishPowerSource: boolean;

  constructor(name: string) {
    super();
    this.name = name;
  }

  setPowerSource(powerSource: TurkishPowerSource) {
    this.powerSource = powerSource;
    this.turkishPowerSource = true;
  }

  setUSPowerSource(usPowerSource: USPowerSource) {
    this.usPowerSource = usPowerSource;
    this.turkishPowerSource = false;
  }

  start(): void {
    console.log(`TurkishHomeAppliance ${this.name} is starting!`);
    if (this.turkishPowerSource) {
      this.powerSource.turnOn();
    } else {
      this.usPowerSource.pushSwitch();
    }
  }

  stop(): void {
    console.log(`TurkishHomeAppliance ${this.name} stoping!`);
    if (this.turkishPowerSource) {
      this.powerSource.turnOff();
    } else {
      this.usPowerSource.pushSwitch();
    }
  }
}