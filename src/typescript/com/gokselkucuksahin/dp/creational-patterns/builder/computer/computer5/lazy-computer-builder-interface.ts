import {Computer} from "./computer";

export interface LazyComputerBuilderInterface {
  buildRAM(): LazyComputerBuilderInterface;

  buildCPU(): LazyComputerBuilderInterface;

  buildHDD(): LazyComputerBuilderInterface;

  buildGraphicCard(): LazyComputerBuilderInterface;

  buildDisplay(): LazyComputerBuilderInterface;

  buildMouse(): LazyComputerBuilderInterface;

  buildKeyboard(): LazyComputerBuilderInterface;

  build(): Computer;
}