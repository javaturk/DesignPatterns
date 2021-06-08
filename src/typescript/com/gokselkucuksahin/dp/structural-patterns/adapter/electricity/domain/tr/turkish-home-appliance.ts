import {HomeAppliance} from "./home-appliance";

export class TurkishHomeAppliance extends HomeAppliance {
  protected readonly name: string;

  constructor(name: string) {
    super();
    this.name = name;
  }

  start(): void {
    console.log(`TurkishHomeAppliance ${this.name} is starting!`);
    this.powerSource.turnOn();
  }

  stop(): void {
    console.log(`TurkishHomeAppliance ${this.name} is stoping!`);
    this.powerSource.turnOff();
  }
}