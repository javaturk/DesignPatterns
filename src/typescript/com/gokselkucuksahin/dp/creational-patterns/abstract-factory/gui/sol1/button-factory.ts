import {GUIFactory} from "./gui-factory";
import {Component} from "./component";
import {Button} from "./button";

export class ButtonFactory implements GUIFactory {
  create(): Component {
    return new Button();
  }
}