import {Factory} from "./factory";
import {AccountFactory} from "./account-factory";
import {Customer} from "../domain/customer";
import {Account} from "../domain/account";

export class Test {

  static main(): void {
    const factory: Factory = new AccountFactory();
    // Normal account. Credit amount is fixed at 1000.
    const normalDefaultAccount = factory.createNormalAccount(new Customer("Remzi"), 4500);
    normalDefaultAccount.iban = "2";
    console.log(normalDefaultAccount.openToWithdraw);
    console.log(normalDefaultAccount.openToPayment);
    console.log(normalDefaultAccount.openToTransfer);
    console.log("");

    // Negative account
    const negativeDefaultAccount = factory.createNegativeAccount(new Customer("Mustafa"), -750);
    console.log(negativeDefaultAccount.openToWithdraw);
    console.log(negativeDefaultAccount.openToPayment);
    console.log(negativeDefaultAccount.openToTransfer);
    console.log("");

    // Frozen default account
    const frozenDefaultAccount = factory.createFrozenAccount(new Customer("Sukran"), -1000);
    console.log(frozenDefaultAccount.openToWithdraw);
    console.log(frozenDefaultAccount.openToPayment);
    console.log(frozenDefaultAccount.openToTransfer);
  }
}

Test.main();