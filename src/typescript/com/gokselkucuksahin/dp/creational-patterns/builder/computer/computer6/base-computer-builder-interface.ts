import {Computer} from "./computer";

export interface BaseComputerBuilderInterface {
  buildRAM(): BaseComputerBuilderInterface;

  buildCPU(): BaseComputerBuilderInterface;

  buildHDD(): BaseComputerBuilderInterface;

  buildBaseComputer(): Computer;

  getComputer(): Computer;
}