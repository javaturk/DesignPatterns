import {Factory} from "./factory";
import {Customer} from "../domain/customer";
import {CorporateCustomer} from "../domain/corporate-customer";

export class CorporateCustomerFactory implements Factory {
  customerPrototype = new CorporateCustomer(100, "Manolya Cad. No 5 Sariyer Istanbul", "2124199047", false, false, new Date(), "GE", 0.25);

  create(): Customer {
    return this.customerPrototype.clone();
  }
}