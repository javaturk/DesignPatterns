import {Computer} from "../domain/computer";

export interface ComputerBuilderInterface {

  buildRAM(): ComputerBuilderInterface;

  buildCPU(): ComputerBuilderInterface;

  buildHDD(): ComputerBuilderInterface;

  buildGraphicCard(): ComputerBuilderInterface;

  buildDisplay(): ComputerBuilderInterface;

  buildMouse(): ComputerBuilderInterface;

  buildKeyboard(): ComputerBuilderInterface;

  build(): Computer;
}