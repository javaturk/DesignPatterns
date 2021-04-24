import {GUIFactory} from "./gui-factory";
import {Button} from "../sol1/button";
import {List} from "../sol1/list";
import {Component} from "../sol1/component";
import {Table} from "../sol1/table";

export class GUIFactoryImpl implements GUIFactory {

  createButton(): Component {
    return new Button();
  }

  createList(): Component {
    return new List();
  }

  createTable(): Component {
    return new Table();
  }
}