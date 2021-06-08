import {Cloneable, Cloner} from "../../../../../cte/clone/clone";

export class Customer implements Cloneable<Customer> {

  private _id: number;
  private _address: string;
  private _phone: string;
  private _authenticated: boolean;
  private _validated: boolean;
  private _membershipDate: Date;

  constructor(id: number, address: string, phone: string, authenticated: boolean, validated: boolean, membershipDate: Date) {
    this._id = id;
    this._address = address;
    this._phone = phone;
    this._authenticated = authenticated;
    this._validated = validated;
    this._membershipDate = membershipDate;
  }

  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }

  get address(): string {
    return this._address;
  }

  set address(value: string) {
    this._address = value;
  }

  get phone(): string {
    return this._phone;
  }

  set phone(value: string) {
    this._phone = value;
  }

  get authenticated(): boolean {
    return this._authenticated;
  }

  set authenticated(value: boolean) {
    this._authenticated = value;
  }

  get validated(): boolean {
    return this._validated;
  }

  set validated(value: boolean) {
    this._validated = value;
  }

  get membershipDate(): Date {
    return this._membershipDate;
  }

  set membershipDate(value: Date) {
    this._membershipDate = value;
  }

  clone(): Customer {
    return <Customer>Cloner.classInstanceClone(this);
  }
}