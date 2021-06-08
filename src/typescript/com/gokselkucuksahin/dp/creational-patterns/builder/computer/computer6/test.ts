import {Computer} from "./computer";

export class Test {
  static main() {
    const bareBoneComputer: Computer = Computer.getBaseBuilder("My Computer").buildRAM().buildCPU().buildHDD().buildBaseComputer();

    console.log("\n");

    const computerWithDisplay: Computer = bareBoneComputer.getDisplayBuilder().buildGraphicCard().buildDisplay().buildComputerDisplay();
    computerWithDisplay.start();

    console.log("\n");

    const computerWithDisplayAndAccessories: Computer = computerWithDisplay.getAccessoryBuilder().buildKeyboard().buildMouse().buildAccessories();
    computerWithDisplayAndAccessories.start();
  }
}

Test.main();