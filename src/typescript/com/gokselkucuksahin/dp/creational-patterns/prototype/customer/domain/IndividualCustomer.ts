import {Customer} from "./customer";

export class IndividualCustomer extends Customer {
  private _firstName: string;
  private _lastName: string;
  private _dob: Date;

  constructor(id: number, address: string, phone: string, authenticated: boolean,
              validated: boolean, membershipDate: Date, firstName: string, lastName: string, dob: Date) {
    super(id, address, phone, authenticated, validated, membershipDate);
    this._firstName = firstName;
    this._lastName = lastName;
    this._dob = dob;
  }

  get firstName(): string {
    return this._firstName;
  }

  set firstName(value: string) {
    this._firstName = value;
  }

  get lastName(): string {
    return this._lastName;
  }

  set lastName(value: string) {
    this._lastName = value;
  }

  get dob(): Date {
    return this._dob;
  }

  set dob(value: Date) {
    this._dob = value;
  }

  toString(): string {
    return `IndividualCustomer [firstName="${this.firstName}, lastName=${this.lastName}, dob=${this.dob},` +
        `id=${this.id}, address=${this.address}, phone=${this.phone}, authenticated=${this.authenticated},` +
        ` validated=${this.validated}, membershipDate=${this.membershipDate}]`
  }

  cloneAuthenticatedAndValidatedIndividualCustomer() {
    const customer = <IndividualCustomer>super.clone();
    customer.authenticated = true;
    customer.validated = true;
    return customer;
  }
}