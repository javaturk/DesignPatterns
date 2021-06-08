import {Customer} from "./customer";

export class CorporateCustomer extends Customer {
  private _corporateName: string;
  private _discount: number;

  constructor(id: number, address: string, phone: string, authenticated: boolean,
              validated: boolean, membershipDate: Date, corporateName: string, discount: number) {
    super(id, address, phone, authenticated, validated, membershipDate);
    this._corporateName = corporateName;
    this._discount = discount;
  }


  get corporateName(): string {
    return this._corporateName;
  }

  set corporateName(value: string) {
    this._corporateName = value;
  }

  get discount(): number {
    return this._discount;
  }

  set discount(value: number) {
    this._discount = value;
  }

  toString(): string {
    return `CorporateCustomer [corporateName=${this.corporateName}, discount=${this.discount},` +
        ` id=${this.id}, address=${this.address}, phone=${this.phone}, authenticated=${this.authenticated}]`;
  }
}