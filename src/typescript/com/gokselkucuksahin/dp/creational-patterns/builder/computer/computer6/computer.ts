import {CPU} from "../domain/cpu";
import {RAM} from "../domain/ram";
import {HDD} from "../domain/hdd";
import {GraphiscCard} from "../domain/graphisc-card";
import {Display} from "../domain/display";
import {Keyboard} from "../domain/keyboard";
import {Mouse} from "../domain/mouse";
import {BaseComputerBuilderInterface} from "./base-computer-builder-interface";
import {ComputerDisplayBuilderInterface} from "./computer-display-builder-interface";
import {AccessoryBuilderInterface} from "./accessory-builder-interface";

export class Computer {
  private static baseComputerBuilder: BaseComputerBuilderInterface;
  private computerDisplayBuilder: ComputerDisplayBuilderInterface;
  private accessoryBuilder: AccessoryBuilderInterface;

  private _name: string;
  private _cpu: CPU;
  private _ram: RAM;
  private _hdd: HDD;
  private _graphicCard: GraphiscCard;
  private _display: Display;
  private _keyboard: Keyboard;
  private _mouse: Mouse;

  private static computer_1(name: string, cpu: CPU, ram: RAM, hdd: HDD, graphiscCard: GraphiscCard): Computer {
    const computer = new Computer();
    computer._name = name;
    computer._cpu = cpu;
    computer._ram = ram;
    computer._hdd = hdd;
    computer._graphicCard = graphiscCard;
    return computer;
  }

  private static computer_2(name: string, cpu: CPU, ram: RAM, hdd: HDD, graphiscCard: GraphiscCard, display: Display): Computer {
    const computer = Computer.computer_1(name, cpu, ram, hdd, graphiscCard);
    computer._display = display;
    return computer;
  }

  private static computer_3(name: string, cpu: CPU, ram: RAM, hdd: HDD, graphiscCard: GraphiscCard, display: Display, keyboard: Keyboard): Computer {
    const computer = Computer.computer_2(name, cpu, ram, hdd, graphiscCard, display);
    computer._keyboard = keyboard;
    return computer;
  }

  private static computer_4(name: string, cpu: CPU, ram: RAM, hdd: HDD, graphiscCard: GraphiscCard, display: Display, keyboard: Keyboard, mouse: Mouse): Computer {
    const computer = Computer.computer_3(name, cpu, ram, hdd, graphiscCard, display, keyboard);
    computer._mouse = mouse;
    return computer;
  }

  start(): void {
    this._cpu.start();
    this._ram.loadOSKernelImage();
    this._ram.loadOS();
    this._ram.loadDrivers();
    this._ram.startServices();
    this._hdd.start();
    !!this._graphicCard && this._graphicCard.start();
    !!this._display && this._display.start();
    !!this._keyboard && this._keyboard.start();
    !!this._mouse && this._mouse.start();
    console.log(`Computer ${this._name} has started.!`);
  }

  get name(): string {
    return this._name;
  }

  get cpu(): CPU {
    return this._cpu;
  }

  get ram(): RAM {
    return this._ram;
  }

  get hdd(): HDD {
    return this._hdd;
  }

  get graphicCard(): GraphiscCard {
    return this._graphicCard;
  }

  get display(): Display {
    return this._display;
  }

  get keyboard(): Keyboard {
    return this._keyboard;
  }

  get mouse(): Mouse {
    return this._mouse;
  }

  static getBaseBuilder(name: string) {
    Computer.baseComputerBuilder = new Computer.BaseComputerBuilder(name);
    return Computer.baseComputerBuilder;
  }

  getDisplayBuilder() {
    this.computerDisplayBuilder = new Computer.ComputerDisplayBuilder(Computer.baseComputerBuilder);
    return this.computerDisplayBuilder;
  }

  getAccessoryBuilder() {
    this.accessoryBuilder = new Computer.AccessoryBuilder(this.computerDisplayBuilder);
    return this.accessoryBuilder;
  }

  private static BaseComputerBuilder = class implements BaseComputerBuilderInterface {
    private name: string;

    private hasRAM: boolean;
    private hasCPU: boolean;
    private hasHDD: boolean;

    private computer: Computer;

    constructor(name: string) {
      this.name = name;
    }

    buildRAM(): BaseComputerBuilderInterface {
      this.hasRAM = true;
      return this;
    }

    buildCPU(): BaseComputerBuilderInterface {
      this.hasCPU = true;
      return this;
    }

    buildHDD(): BaseComputerBuilderInterface {
      this.hasHDD = true;
      return this;
    }

    buildBaseComputer(): Computer {
      this.computer = new Computer();
      this.computer._name = this.name;

      !!this.hasRAM && (this.computer._ram = new RAM());
      !!this.hasCPU && (this.computer._cpu = new CPU());
      !!this.hasHDD && (this.computer._hdd = new HDD());

      return this.computer;
    }

    getComputer(): Computer {
      return this.computer;
    }
  }

  private static ComputerDisplayBuilder = class implements ComputerDisplayBuilderInterface {

    private hasGC: boolean;
    private hasDisplay: boolean;

    private computer: Computer;

    constructor(baseComputerBuilder: BaseComputerBuilderInterface) {
      this.computer = baseComputerBuilder.getComputer();
    }

    buildGraphicCard(): ComputerDisplayBuilderInterface {
      this.hasGC = true;
      return this;
    }

    buildDisplay(): ComputerDisplayBuilderInterface {
      this.hasDisplay = true;
      return this;
    }

    buildComputerDisplay(): Computer {
      !!this.hasGC && (this.computer._graphicCard = new GraphiscCard());
      !!this.hasDisplay && (this.computer._display = new Display());
      return this.computer;
    }

    getComputer(): Computer {
      return this.computer;
    }
  }

  private static AccessoryBuilder = class implements AccessoryBuilderInterface {

    private hasMouse: boolean;
    private hasKeyboard: boolean;

    private computer: Computer;

    constructor(computerDisplayBuilder: ComputerDisplayBuilderInterface) {
      this.computer = computerDisplayBuilder.getComputer();
    }

    buildMouse(): AccessoryBuilderInterface {
      this.hasMouse = true;
      return this;
    }

    buildKeyboard(): AccessoryBuilderInterface {
      this.hasKeyboard = true;
      return this;
    }

    buildAccessories(): Computer {
      !!this.hasMouse && (this.computer._mouse = new Mouse());
      !!this.hasKeyboard && (this.computer._keyboard = new Keyboard());
      return this.computer;
    }
  }
}