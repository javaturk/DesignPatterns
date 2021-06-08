import {CPU} from "../domain/cpu";
import {RAM} from "../domain/ram";
import {HDD} from "../domain/hdd";
import {GraphiscCard} from "../domain/graphisc-card";
import {Keyboard} from "../domain/keyboard";
import {Mouse} from "../domain/mouse";
import {Display} from "../domain/display";
import {Computer} from "../domain/computer";

export class Test {
  static main() {
    const test = new Test();

    const cpu1 = test.produceCPU();
    const ram1 = test.produceRAM();
    const hdd1 = test.produceHDD();
    const graphicCard1 = test.produceGraphicCard();
    const computerWithOutDisplayKeyboardAndMouse = Computer.computer_1("computerWithOutDisplayKeyboardAndMouse", cpu1, ram1, hdd1, graphicCard1);
    computerWithOutDisplayKeyboardAndMouse.start();

    const cpu2 = test.produceCPU();
    const ram2 = test.produceRAM();
    const hdd2 = test.produceHDD();
    const graphicCard2 = test.produceGraphicCard();
    const display2 = test.produceDisplay();
    const keyboard2 = test.produceKeyboard();
    const mouse2 = test.produceMouse();

    const computerFull1 = Computer.computer_4("computer full1", cpu2, ram2, hdd2, graphicCard2, display2, keyboard2, mouse2);
    computerFull1.start();

    const computerFull2 = new Computer();
    computerFull2.name = "Computer full2";
    const cpu3 = test.produceCPU();
    computerFull2.cpu = cpu3;
    const ram3 = test.produceRAM();
    computerFull2.ram = ram3;
    const hdd3 = test.produceHDD();
    computerFull2.hdd = hdd3;
    const graphicCard3 = test.produceGraphicCard();
    computerFull2.graphicCard = graphicCard3;
    const display3 = test.produceDisplay();
    computerFull2.display = display3;
    const keyboard3 = test.produceKeyboard();
    computerFull2.keyboard = keyboard3;
    const mouse3 = test.produceMouse();
    computerFull2.mouse = mouse3;

    computerFull2.start();

  }

  produceCPU(): CPU {
    return new CPU();
  }

  produceRAM(): RAM {
    return new RAM()
  }

  produceHDD(): HDD {
    return new HDD();
  }

  produceGraphicCard(): GraphiscCard {
    return new GraphiscCard();
  }

  produceDisplay(): Display {
    return new Display();
  }

  produceKeyboard(): Keyboard {
    return new Keyboard();
  }

  produceMouse(): Mouse {
    return new Mouse();
  }
}

Test.main();