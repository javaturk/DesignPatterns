import {IndividualCustomer} from "../domain/IndividualCustomer";

export class Test {
  static main() {
    const customerPrototype: IndividualCustomer = new IndividualCustomer(1, "dummy address", "dummy phone", false, false, new Date(), "dummy name", "dummy lastname", new Date());
    console.log(customerPrototype.toString());

    // Unauthenticated and unvalidated individual customer
    const ic1 = <IndividualCustomer>customerPrototype.clone();
    ic1.firstName = "Ali";
    ic1.lastName = "Kemal";
    ic1.address = "address1";
    ic1.phone = "phone1";
    ic1.dob = new Date();
    console.log(ic1.toString());

    // Authenticated and validated individual customer
    const ic2 = <IndividualCustomer>customerPrototype.clone();
    ic2.id = 4;
    ic2.firstName = "Selim";
    ic2.lastName = "Ozel";
    ic2.address = "address4";
    ic2.phone = "phone4";
    ic2.dob = new Date();
    ic2.authenticated = true;
    ic2.validated = true;
    console.log(ic2.toString());
  }
}

Test.main();