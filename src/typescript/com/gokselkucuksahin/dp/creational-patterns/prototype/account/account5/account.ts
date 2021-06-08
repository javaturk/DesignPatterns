import {Cloneable, Cloner} from "../../../../../cte/clone/clone";
import {Customer} from "../domain/customer";

export class Account implements Cloneable<Account> {
  private _iban: string;
  private _balance: number;
  private _credit: number;
  private _owner: Customer;

  private _openToWithdraw: boolean;
  private _openToPayment: boolean;
  private _openToTransfer: boolean;

  // Normal account
  private static normalPrototype = new Account("1", 0, 1000, null, true, true, true);

  // Negative account
  private static negativePrototype = new Account("1", 0, 1000, null, true, true, false);

  // Frozen account
  private static frozenPrototype = new Account("1", -1000, 1000, null, false, false, false);

  constructor(iban: string, balance: number, credit: number, owner: Customer,
              openToWithdraw: boolean, openToPayment: boolean, openToTransfer) {
    this._iban = iban;
    this._balance = balance;
    this._credit = credit;
    this._owner = owner;
    this._openToWithdraw = openToWithdraw;
    this._openToPayment = openToPayment;
    this._openToTransfer = openToTransfer;
  }


  get iban(): string {
    return this._iban;
  }

  set iban(value: string) {
    this._iban = value;
  }

  get balance(): number {
    return this._balance;
  }

  set balance(value: number) {
    this._balance = value;
  }

  get credit(): number {
    return this._credit;
  }

  set credit(value: number) {
    this._credit = value;
  }

  get owner(): Customer {
    return this._owner;
  }

  set owner(value: Customer) {
    this._owner = value;
  }

  get openToWithdraw(): boolean {
    return this._openToWithdraw;
  }

  set openToWithdraw(value: boolean) {
    this._openToWithdraw = value;
  }

  get openToPayment(): boolean {
    return this._openToPayment;
  }

  set openToPayment(value: boolean) {
    this._openToPayment = value;
  }

  get openToTransfer(): boolean {
    return this._openToTransfer;
  }

  set openToTransfer(value: boolean) {
    this._openToTransfer = value;
  }

  clone(): Account {
    return <Account>Cloner.classInstanceClone(this);
  }

  static createNormalAccount(owner: Customer, balance: number): Account {
    const account = this.normalPrototype.clone();
    account.owner = owner;
    account.balance = balance;
    return account
  }

  static createNegativeAccount(owner: Customer, balance: number): Account {
    const account = this.negativePrototype.clone();
    account.owner = owner;
    account.balance = balance;
    return account
  }

  static createFrozenAccount(owner: Customer, balance: number): Account {
    const account = this.frozenPrototype.clone();
    account.owner = owner;
    account.balance = balance;
    return account
  }
}