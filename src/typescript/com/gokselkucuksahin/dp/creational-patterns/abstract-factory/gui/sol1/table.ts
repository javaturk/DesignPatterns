import {Component} from "./component";

export class Table implements Component {
  paint(): void {
    console.log("Painting a table!")
  }

}