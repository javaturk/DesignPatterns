import {Customer} from "../domain/customer";
import {Account} from "./account";

export class Test {

  static main(): void {
    // Normal account. Credit amount is fixed at 1000.
    const normalAccount = Account.createNormalAccount(new Customer("Remzi"), 4500);
    normalAccount.iban = "2";
    console.log(normalAccount.openToWithdraw);
    console.log(normalAccount.openToPayment);
    console.log(normalAccount.openToTransfer);
    console.log("\n");

    // Negative account
    const negativeAccount = Account.createNegativeAccount(new Customer("Mustafa"), -750);
    console.log(negativeAccount.openToWithdraw);
    console.log(negativeAccount.openToPayment);
    console.log(negativeAccount.openToTransfer);
    console.log("\n");

    // Frozen default account
    const frozenAccount = Account.createFrozenAccount(new Customer("Sukran"), -1000);
    console.log(frozenAccount.openToWithdraw);
    console.log(frozenAccount.openToPayment);
    console.log(frozenAccount.openToTransfer);
  }
}

Test.main();