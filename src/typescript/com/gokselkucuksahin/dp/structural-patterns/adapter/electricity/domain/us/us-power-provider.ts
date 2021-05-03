import {USPowerSource} from "./us-power-source";

export class USPowerProvider implements USPowerSource {
  private on: boolean;

  constructor() {
    console.log("USPowerProvider is up and running.");
  }

  providePowerAt110V(): void {
    console.log("USPowerProvider provides electricity at 110V!");
  }

  pushSwitch(): void {
    if (this.on) {
      console.log("USPowerProvider stopped to provide electricity.");
    } else {
      console.log("USPowerProvider started to provide electricity.");
    }
    this.on = !this.on;
  }
}