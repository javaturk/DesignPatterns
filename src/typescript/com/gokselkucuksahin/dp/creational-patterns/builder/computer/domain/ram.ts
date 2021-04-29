import {BIOS} from "./bios";

export class RAM {
  private bios: BIOS;

  constructor() {
    this.bios = new BIOS();
  }

  loadOSKernelImage(): void {
    console.log("RAM: Loading the image of OS kernel.");
    this.bios.start();
    console.log("RAM: Image of OS kernel has been loaded.");
  }

  loadOS(): void {
    console.log("OS has been loaded.");
  }

  loadDrivers(): void {
    console.log("Drivers have been loaded.");
  }

  startServices(): void {
    console.log("Services have started.");
  }
}