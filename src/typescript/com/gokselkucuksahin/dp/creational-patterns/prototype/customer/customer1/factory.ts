import {Customer} from "../domain/customer";

export interface Factory {
  create() : Customer;
}