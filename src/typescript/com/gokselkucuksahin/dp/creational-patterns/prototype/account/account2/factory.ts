import {Account} from "../domain/account";
import {Customer} from "../domain/customer";

export interface Factory {
  create(owner: Customer, balance: number): Account;
}