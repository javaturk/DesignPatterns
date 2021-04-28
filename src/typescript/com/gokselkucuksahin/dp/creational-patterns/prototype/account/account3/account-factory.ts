import {Factory} from "./factory";
import {Customer} from "../domain/customer";
import {Account} from "../domain/account";

export class AccountFactory implements Factory {

  // Normal account
  static normalPrototype = new Account("1", 0, 1000, null, true, true, true);

  // Negative account
  static negativePrototype = new Account("1", 0, 1000, null, true, true, false);

  // Frozen account
  static frozenPrototype = new Account("1", -1000, 1000, null, false, false, false);

  createFrozenAccount(owner: Customer, balance: number): Account {
    const account = AccountFactory.frozenPrototype.clone();
    account.owner = owner;
    account.balance = balance;
    return account;
  }

  createNegativeAccount(owner: Customer, balance: number): Account {
    const account = AccountFactory.negativePrototype.clone();
    account.owner = owner;
    account.balance = balance;
    return account;
  }

  createNormalAccount(owner: Customer, balance: number): Account {
    const account = AccountFactory.normalPrototype.clone();
    account.owner = owner;
    account.balance = balance;
    return account;
  }
}