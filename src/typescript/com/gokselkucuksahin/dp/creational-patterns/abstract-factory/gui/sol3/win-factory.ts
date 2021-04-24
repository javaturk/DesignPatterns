import {GUIFactory} from "../sol2/gui-factory";
import {Component} from "../sol1/component";
import {WinButton} from "./win-button";
import {WinList} from "./win-list";
import {WinTable} from "./win-table";

export class WinFactory implements GUIFactory {
  createButton(): Component {
    return new WinButton();
  }

  createList(): Component {
    return new WinList();
  }

  createTable(): Component {
    return new WinTable();
  }
}