import {GUIFactory} from "./gui-factory";
import {Table} from "./table";
import {Component} from "./component";

export class TableFactory implements GUIFactory {
  create(): Component {
    return new Table();
  }
}