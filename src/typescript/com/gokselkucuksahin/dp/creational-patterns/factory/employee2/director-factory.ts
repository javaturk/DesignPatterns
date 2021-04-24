import {Factory} from "./factory";
import {Director} from "../employee1/director";
import {EmployeeRandomizer} from "../employee-randomizer";

export class DirectorFactory implements Factory {
  create(name: string): Director {
    return new Director(EmployeeRandomizer.createId(), name,
        EmployeeRandomizer.createYear(), "Management", "Management", 5000);
  }
}