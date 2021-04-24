import {Component} from "./component";

export interface GUIFactory {
  create(): Component;
}