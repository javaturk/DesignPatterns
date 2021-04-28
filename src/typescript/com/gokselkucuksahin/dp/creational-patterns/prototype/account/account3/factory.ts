import {Customer} from "../domain/customer";
import {Account} from "../domain/account";

export interface Factory {
  createNormalAccount(owner: Customer, balance: number): Account;

  createNegativeAccount(owner: Customer, balance: number): Account;

  createFrozenAccount(owner: Customer, balance: number): Account;
}