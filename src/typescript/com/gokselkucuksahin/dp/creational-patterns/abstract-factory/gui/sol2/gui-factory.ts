import {Component} from "../sol1/component";

export interface GUIFactory {
  createButton(): Component;

  createList(): Component;

  createTable(): Component;
}