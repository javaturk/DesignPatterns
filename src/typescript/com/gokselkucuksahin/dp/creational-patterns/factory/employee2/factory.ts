import {Employee} from "../employee1/employee";

export interface Factory {
  create(name: string): Employee;
}