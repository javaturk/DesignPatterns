import {ComputerBuilderInterface} from "./computer-builder-interface";
import {Computer} from "../domain/computer";
import {Display} from "../domain/display";
import {GraphiscCard} from "../domain/graphisc-card";
import {HDD} from "../domain/hdd";
import {RAM} from "../domain/ram";
import {CPU} from "../domain/cpu";

export class ComputerBuilder implements ComputerBuilderInterface {

  private computer: Computer;

  build(): Computer {
    this.computer = new Computer();
    this.buildRAM();
    this.buildCPU();
    this.buildHDD();
    this.buildGraphicCard();
    this.buildDisplay();
    return this.computer;
  }

  buildCPU(): void {
    const cpu = new CPU();
    this.computer.cpu = cpu;
  }

  buildRAM(): void {
    const ram = new RAM();
    this.computer.ram = ram;
  }

  buildHDD(): void {
    const hdd = new HDD();
    this.computer.hdd = hdd;
  }

  buildDisplay(): void {
    const display = new Display();
    this.computer.display = display;
  }

  buildGraphicCard(): void {
    const graphicCard = new GraphiscCard();
    this.computer.graphicCard = graphicCard;
  }
}