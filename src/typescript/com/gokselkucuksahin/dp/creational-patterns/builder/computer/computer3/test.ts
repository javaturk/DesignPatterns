import {ComputerBuilderInterface} from "./computer-builder-interface";
import {ComputerBuilder} from "./computer-builder";

export class Test {
  static main() {
    const builder: ComputerBuilderInterface = ComputerBuilder.builder;
    const computer1 = builder.buildRAM().buildHDD().buildGraphicCard().buildDisplay().buildCPU().build();
    computer1.start();

    console.log("\n");

    const computer2 = builder.buildRAM().buildHDD().buildGraphicCard().buildDisplay().buildCPU().buildMouse().buildKeyboard().build();
    computer2.start();
  }
}

Test.main();