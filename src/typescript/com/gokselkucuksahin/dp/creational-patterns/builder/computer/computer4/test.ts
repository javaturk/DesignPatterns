import {Computer} from "./computer";

export class Test {
  static main() {
    const bareBoneComputer = Computer.getBuilder("barebone computer").buildCPU().buildRAM().buildHDD().build();
    bareBoneComputer.start();
  }
}

Test.main();