import {GUIFactory} from "./gui-factory";
import {Component} from "../sol1/component";

export class Client {
  constructor(factory: GUIFactory) {
    const button: Component = factory.createButton();
    button.paint();

    const list: Component = factory.createList();
    list.paint();

    const table: Component = factory.createTable();
    table.paint();
  }
}