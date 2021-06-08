import {CPU} from "./cpu";
import {RAM} from "./ram";
import {HDD} from "./hdd";
import {GraphiscCard} from "./graphisc-card";
import {Display} from "./display";
import {Keyboard} from "./keyboard";
import {Mouse} from "./mouse";

export class Computer {

  private _name: string;
  private _cpu: CPU;
  private _ram: RAM;
  private _hdd: HDD;
  private _graphicCard: GraphiscCard;
  private _display: Display;
  private _keyboard: Keyboard;
  private _mouse: Mouse;

  static computer_1(name: string, cpu: CPU, ram: RAM, hdd: HDD, graphiscCard: GraphiscCard): Computer {
    const computer = new Computer();
    computer._name = name;
    computer._cpu = cpu;
    computer._ram = ram;
    computer._hdd = hdd;
    computer._graphicCard = graphiscCard;
    return computer;
  }

  static computer_2(name: string, cpu: CPU, ram: RAM, hdd: HDD, graphiscCard: GraphiscCard, display: Display): Computer {
    const computer = Computer.computer_1(name, cpu, ram, hdd, graphiscCard);
    computer._display = display;
    return computer;
  }

  static computer_3(name: string, cpu: CPU, ram: RAM, hdd: HDD, graphiscCard: GraphiscCard, display: Display, keyboard: Keyboard): Computer {
    const computer = Computer.computer_2(name, cpu, ram, hdd, graphiscCard, display);
    computer._keyboard = keyboard;
    return computer;
  }

  static computer_4(name: string, cpu: CPU, ram: RAM, hdd: HDD, graphiscCard: GraphiscCard, display: Display, keyboard: Keyboard, mouse: Mouse): Computer {
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
    this._graphicCard.start();
    !! this._display && this._display.start();
    !! this._keyboard && this._keyboard.start();
    !! this._mouse && this._mouse.start();
    console.log(`Computer ${this._name} has started.!`);
  }

  get name(): string {
    return this._name;
  }

  set name(value: string) {
    this._name = value;
  }

  get cpu(): CPU {
    return this._cpu;
  }

  set cpu(value: CPU) {
    this._cpu = value;
  }

  get ram(): RAM {
    return this._ram;
  }

  set ram(value: RAM) {
    this._ram = value;
  }

  get hdd(): HDD {
    return this._hdd;
  }

  set hdd(value: HDD) {
    this._hdd = value;
  }

  get graphicCard(): GraphiscCard {
    return this._graphicCard;
  }

  set graphicCard(value: GraphiscCard) {
    this._graphicCard = value;
  }

  get display(): Display {
    return this._display;
  }

  set display(value: Display) {
    this._display = value;
  }

  get keyboard(): Keyboard {
    return this._keyboard;
  }

  set keyboard(value: Keyboard) {
    this._keyboard = value;
  }

  get mouse(): Mouse {
    return this._mouse;
  }

  set mouse(value: Mouse) {
    this._mouse = value;
  }
}