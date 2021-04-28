import {Builder} from "./builder";
import {Person} from "./person";

export class PersonBuilder implements Builder<Person> {


  build(): Person {
    return undefined;
  }
}