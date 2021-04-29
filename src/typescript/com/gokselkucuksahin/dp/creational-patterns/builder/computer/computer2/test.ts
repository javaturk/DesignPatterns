import {ComputerBuilderInterface} from "./computer-builder-interface";
import {ComputerBuilder} from "./computer-builder";
import {Computer} from "../domain/computer";

export class Test {
  static main() {
    const builder: ComputerBuilderInterface = new ComputerBuilder();
    const computer: Computer = builder.build();
    computer.start();
  }
}

Test.main();