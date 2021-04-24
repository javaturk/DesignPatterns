import {Component} from "./component";

export class List implements Component {
  paint(): void {
    console.log("Painting a list!");
  }
}