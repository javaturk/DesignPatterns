import {RAM} from "../domain/ram";
import {CPU} from "../domain/cpu";
import {HDD} from "../domain/hdd";
import {GraphiscCard} from "../domain/graphisc-card";
import {Display} from "../domain/display";
import {Computer} from "../domain/computer";

export interface ComputerBuilderInterface {
  buildRAM(): RAM;

  buildCPU(): CPU;

  buildHDD(): HDD;

  buildGraphicCard(): GraphiscCard;

  buildDisplay(): Display;

  buildComputer(): Computer;
}