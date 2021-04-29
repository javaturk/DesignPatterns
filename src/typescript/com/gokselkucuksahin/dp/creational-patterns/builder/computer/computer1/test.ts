import {ComputerBuilderInterface} from "./computer-builder-interface";
import {ComputerBuilder} from "./computer-builder";
import {Computer} from "../domain/computer";
import {RAM} from "../domain/ram";
import {Display} from "../domain/display";

export class Test {
  static main() {
    const builder: ComputerBuilderInterface = new ComputerBuilder();
    const computer: Computer = builder.buildComputer();
    computer.start();

    const ram: RAM = builder.buildRAM();
    const display: Display = builder.buildDisplay();
  }
}

Test.main();