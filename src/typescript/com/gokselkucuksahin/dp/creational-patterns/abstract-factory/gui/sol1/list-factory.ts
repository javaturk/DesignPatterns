import {GUIFactory} from "./gui-factory";
import {List} from "./list";
import {Component} from "./component";

export class ListFactory implements GUIFactory {
  create(): Component {
    return new List();
  }
}