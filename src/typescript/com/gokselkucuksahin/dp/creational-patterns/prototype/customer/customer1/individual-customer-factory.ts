import {Factory} from "./factory";
import {IndividualCustomer} from "../domain/IndividualCustomer";
import {Customer} from "../domain/customer";

export class IndividualCustomerFactory implements Factory {
  customerPrototype: IndividualCustomer = new IndividualCustomer(1, "dummy address", "dummy phone", false, false, new Date(), "dummy name", "dummy lastname", new Date());

  create(): Customer {
    return this.customerPrototype.clone();
  }
}