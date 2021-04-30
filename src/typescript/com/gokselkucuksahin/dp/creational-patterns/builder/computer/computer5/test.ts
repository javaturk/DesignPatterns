import {Computer} from "./computer";

export class Test {
  static main() {
    const bareBoneComputer = Computer.getBuilder("barebone computer").buildCPU().buildRAM().buildHDD().build();
    bareBoneComputer.start();

    console.log("\n");

    Computer.getBuilder("another computer").buildCPU().buildRAM().buildHDD().build().start();

    console.log("\n");

    Computer.getBuilder("barebone computer").buildCPU().buildRAM().buildHDD();
  }
}

Test.main();