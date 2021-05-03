import {TurkishHomeAppliance} from "../domain/tr/turkish-home-appliance";
import {USPowerSource} from "../domain/us/us-power-source";
import {TurkishPowerSource} from "../domain/tr/turkish-power-source";

export class TurkishHomeApplianceCompatibleWithUsPowerSource extends TurkishHomeAppliance {
  private usPowerSource: USPowerSource;
  private turkishPowerSource: boolean;

  constructor(name: string) {
    super(name);
  }


  setPowerSource(powerSource: TurkishPowerSource) {
    this.powerSource = powerSource;
    this.turkishPowerSource = true;
  }

  setUSPowerSource(usPowerSource: USPowerSource): void {
    this.usPowerSource = usPowerSource;
    this.turkishPowerSource = false;
  }


  start() {
    console.log(`TurkishHomeAppliance ${this.name} is starting!`);
    if (this.turkishPowerSource) {
      this.powerSource.turnOn();
    } else {
      this.usPowerSource.pushSwitch();
    }
  }

  stop() {
    console.log(`TurkishHomeAppliance ${this.name} is stoping!`);
    if (this.turkishPowerSource) {
      this.powerSource.turnOff();
    } else {
      this.usPowerSource.pushSwitch();
    }
  }
}