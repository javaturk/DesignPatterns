import {Employee} from "./employee";

export interface Factory {
  create(): Employee;
}