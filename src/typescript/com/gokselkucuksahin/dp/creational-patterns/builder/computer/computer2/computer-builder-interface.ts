import {Computer} from "../domain/computer";

export interface ComputerBuilderInterface {
  build(): Computer;
}