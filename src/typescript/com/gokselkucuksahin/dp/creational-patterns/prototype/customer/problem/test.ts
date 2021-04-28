import {IndividualCustomer} from "../domain/IndividualCustomer";
import {CorporateCustomer} from "../domain/corporate-customer";

export class Test {
  static main() {
    // Unauthenticated and unvalidated individual customer
    const ic1 = new IndividualCustomer(1, "address1", "phone1", false, false, new Date(), "Ali", "Kemal", new Date());

    // Authenticated and unvalidated individual customer
    const ic2 = new IndividualCustomer(2, "address2", "phone2", true, false, new Date(), "Selim", "Ozel", new Date());

    // Unauthenticated and validated individual customer
    const ic3 = new IndividualCustomer(3, "address3", "phone3", false, true, new Date(), "Selim", "Ozel", new Date());

    // Authenticated and validated individual customer
    const ic4 = new IndividualCustomer(4, "address4", "phone4", true, true, new Date(), "Selim", "Ozel", new Date());

    // Unauthenticated and unvalidated corporate customer
    const cc1 = new CorporateCustomer(5, "address5", "phone5", false, false, new Date(), "SmallCompany", 0.1);

    // Authenticated and unvalidated corporate customer
    const cc2 = new CorporateCustomer(6, "address6", "phone6", true, false, new Date(), "BigCompany", 0.2);

    // Unauthenticated and validated corporate customer
    const cc3 = new CorporateCustomer(7, "address7", "phone7", false, true, new Date(), "BiggerCompany", 0.25);

    // Authenticated and validated corporate customer
    const cc4 = new CorporateCustomer(8, "address8", "phone8", true, true, new Date(), "BiggestCompany", 0.3);
  }
}

Test.main();