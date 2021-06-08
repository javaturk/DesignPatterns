import {ComputerBuilderInterface} from "./computer-builder-interface";
import {CPU} from "../domain/cpu";
import {Computer} from "../domain/computer";
import {Display} from "../domain/display";
import {GraphiscCard} from "../domain/graphisc-card";
import {HDD} from "../domain/hdd";
import {RAM} from "../domain/ram";

export class ComputerBuilder implements ComputerBuilderInterface {
  private computer: Computer;


  buildComputer(): Computer {
    this.computer = new Computer();
    this.buildRAM();
    this.buildCPU();
    this.buildHDD();
    this.buildGraphicCard();
    this.buildDisplay();
    return this.computer;
  }

  buildCPU(): CPU {
    const cpu = new CPU();
    this.computer.cpu = cpu;
    return cpu;
  }

  buildDisplay(): Display {
    const display = new Display();
    this.computer.display = display;
    return display;
  }

  buildGraphicCard(): GraphiscCard {
    const graphicCard = new GraphiscCard();
    this.computer.graphicCard = graphicCard;
    return graphicCard;
  }

  buildHDD(): HDD {
    const hdd = new HDD();
    this.computer.hdd = hdd;
    return hdd;
  }

  buildRAM(): RAM {
    const ram = new RAM();
    this.computer.ram = ram;
    return ram;
  }
}