import {Account} from "../domain/account";
import {Customer} from "../domain/customer";
import {Factory} from "./factory";
import {AccountFactory} from "./account-factory";

export class Test {
  static main(): void {
    const factory: Factory = new AccountFactory();

    // Normal account. Credit amount is fixed at 1000.
    const normalAccount: Account = factory.create(new Customer("Mustafa"), 2000);
    normalAccount.iban = "2222";
    console.log(normalAccount.openToPayment);
    console.log(normalAccount.openToWithdraw);
    console.log(normalAccount.openToTransfer);
    console.log("\n");

    // Negative account
    const negativeAccount: Account = factory.create(new Customer("Namik"), 500);
    negativeAccount.iban = "3333";
    negativeAccount.openToTransfer = false;
    console.log(negativeAccount.openToWithdraw);
    console.log(negativeAccount.openToPayment);
    console.log(negativeAccount.openToTransfer);
    console.log("\n");

    // Frozen account
    const frozenAccount: Account = factory.create(new Customer("Zehra"), -5000);
    frozenAccount.iban = "4444";
    frozenAccount.openToWithdraw = false;
    frozenAccount.openToPayment = false;
    frozenAccount.openToTransfer = false;
    console.log(frozenAccount.openToWithdraw);
    console.log(frozenAccount.openToPayment);
    console.log(frozenAccount.openToTransfer);
  }
}

Test.main();