import {Component} from "./component";

export class Button implements Component{
  paint(): void {
    console.log("Painting a button!");
  }
}