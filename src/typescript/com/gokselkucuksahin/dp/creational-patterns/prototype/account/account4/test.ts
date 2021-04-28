import {Factory} from "../account3/factory";
import {AccountFactory} from "./account-factory";
import {Customer} from "../domain/customer";

export class Test {

  static main(): void {
    const factory: Factory = new AccountFactory();
    // Normal account. Credit amount is fixed at 1000.
    const normalDefaultAccount = factory.createNormalAccount(new Customer("Remzi"), 2000);
    normalDefaultAccount.iban = "2";

    // Negative account
    const negativeDefaultAccount = factory.createNegativeAccount(new Customer("Mustafa"), -750);

    // Frozen default account
    const frozenDefaultAccount = factory.createFrozenAccount(new Customer("Sukran"), -1000);
  }
}

Test.main();