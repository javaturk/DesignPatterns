import {Account} from "../domain/account";
import {Customer} from "../domain/customer";

export class Test {
  static main(): void {
    // Normal credit account
    const normalAccount: Account = new Account("1", 1000, 1000, new Customer("Ali"), true, true, true);

    // Negative credit account
    const negativeAccount: Account = new Account("2", -500, 1000, new Customer("Zeynep"), true, true, false);

    // Frozen account
    const frozenAccount: Account = new Account("3", -1000, 1000, new Customer("Metin"), false, false, false);
  }
}

Test.main();