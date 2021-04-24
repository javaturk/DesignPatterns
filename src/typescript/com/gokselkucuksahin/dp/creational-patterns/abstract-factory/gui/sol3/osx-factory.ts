import {GUIFactory} from "../sol2/gui-factory";
import {Component} from "../sol1/component";
import {OSXButton} from "./osx-button";
import {OSXList} from "./osx-list";
import {OSXTable} from "./osx-table";

export class OSXFactory implements GUIFactory {
  createButton(): Component {
    return new OSXButton();
  }

  createList(): Component {
    return new OSXList();
  }

  createTable(): Component {
    return new OSXTable();
  }
}