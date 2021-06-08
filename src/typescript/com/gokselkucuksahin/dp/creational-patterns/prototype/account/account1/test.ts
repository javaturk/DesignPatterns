import {Account} from "../domain/account";
import {Customer} from "../domain/customer";

export class Test {
  static main(): void {
    // Normal credit account
    const normalAccountPrototype: Account = new Account("1", 1000, 1000, new Customer("Ali"), true, true, true);

    // Normal credit account. Credit amount is fixed at 1000.
    const normalDefaultAccount: Account = normalAccountPrototype.clone();
    normalDefaultAccount.iban = "2";
    normalDefaultAccount.balance = 2000;
    normalDefaultAccount.owner = new Customer("Remzi");

    // Negative default credit account
    // const negativeDefaultAccount: Account = new Account("2", -500, 1000, true, new Customer("Zeynep"), true, true, false);
    const negativeDefaultAccount: Account = normalAccountPrototype.clone();
    negativeDefaultAccount.iban = "4";
    negativeDefaultAccount.balance = -600;
    negativeDefaultAccount.owner = new Customer("Mustafa");
    negativeDefaultAccount.openToWithdraw = true;
    negativeDefaultAccount.openToPayment = false;
    negativeDefaultAccount.openToTransfer = false;

    // Frozen default account
    const frozenDefaultAccount: Account = normalAccountPrototype.clone();
    frozenDefaultAccount.balance = -1_000;
    frozenDefaultAccount.owner = new Customer("Sukran");
    frozenDefaultAccount.openToWithdraw = false;
    frozenDefaultAccount.openToPayment = false;
    frozenDefaultAccount.openToTransfer = false;
  }
}

Test.main();