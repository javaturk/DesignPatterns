import {Computer} from "./computer";

export interface ComputerDisplayBuilderInterface {
  buildGraphicCard(): ComputerDisplayBuilderInterface;

  buildDisplay(): ComputerDisplayBuilderInterface;

  buildComputerDisplay(): Computer;

  getComputer(): Computer;
}