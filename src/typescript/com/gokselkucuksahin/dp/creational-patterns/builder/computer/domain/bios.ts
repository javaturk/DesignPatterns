import {ROM} from "./rom";

export class BIOS {
  private rom: ROM;

  constructor() {
    this.rom = new ROM(2 * 1024);
  }

  start(): void {
    console.log("BIOS: Getting the image of OS kernel.");
    this.rom.getOSKernelImage();
  }
}