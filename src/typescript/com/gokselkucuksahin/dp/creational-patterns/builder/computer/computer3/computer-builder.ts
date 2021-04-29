import {ComputerBuilderInterface} from "./computer-builder-interface";
import {Computer} from "../domain/computer";
import {RAM} from "../domain/ram";
import {Mouse} from "../domain/mouse";
import {Keyboard} from "../domain/keyboard";
import {HDD} from "../domain/hdd";
import {GraphiscCard} from "../domain/graphisc-card";
import {Display} from "../domain/display";
import {CPU} from "../domain/cpu";

export class ComputerBuilder implements ComputerBuilderInterface {

  private static _builder = new ComputerBuilder();
  private computer: Computer;

  private constructor() {
    this.computer = new Computer();
  }

  static get builder(): ComputerBuilder {
    return this._builder;
  }

  build(): Computer {
    return this.computer;
  }

  buildCPU(): ComputerBuilderInterface {
    const cpu = new CPU();
    this.computer.cpu = cpu;
    return ComputerBuilder.builder;
  }

  buildDisplay(): ComputerBuilderInterface {
    const display = new Display();
    this.computer.display = display;
    return ComputerBuilder.builder;
  }

  buildGraphicCard(): ComputerBuilderInterface {
    const graphicCard = new GraphiscCard();
    this.computer.graphicCard = graphicCard;
    return ComputerBuilder.builder;
  }

  buildHDD(): ComputerBuilderInterface {
    const hdd = new HDD();
    this.computer.hdd = hdd;
    return ComputerBuilder.builder;
  }

  buildKeyboard(): ComputerBuilderInterface {
    const keyboard = new Keyboard();
    this.computer.keyboard = keyboard;
    return ComputerBuilder.builder;
  }

  buildMouse(): ComputerBuilderInterface {
    const mouse = new Mouse();
    this.computer.mouse = mouse;
    return ComputerBuilder.builder;
  }

  buildRAM(): ComputerBuilderInterface {
    const ram = new RAM();
    this.computer.ram = ram;
    return ComputerBuilder.builder;
  }
}