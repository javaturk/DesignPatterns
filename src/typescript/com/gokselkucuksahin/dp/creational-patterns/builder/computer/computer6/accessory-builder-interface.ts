import {Computer} from "./computer";

export interface AccessoryBuilderInterface {
  buildMouse(): AccessoryBuilderInterface;

  buildKeyboard(): AccessoryBuilderInterface;

  buildAccessories(): Computer;

}