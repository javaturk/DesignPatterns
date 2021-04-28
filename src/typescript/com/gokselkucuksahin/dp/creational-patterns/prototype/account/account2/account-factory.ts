import {Factory} from "./factory";
import {Customer} from "../domain/customer";
import {Account} from "../domain/account";

export class AccountFactory implements Factory {

  // Normal account
  private static prototypeAccount: Account = new Account("1", 1000, 1000, new Customer("Ali"), true, true, true);

  create(owner: Customer, balance: number): Account {
    const account = AccountFactory.prototypeAccount.clone();
    account.owner = owner;
    account.balance = balance;
    return account;
  }
}