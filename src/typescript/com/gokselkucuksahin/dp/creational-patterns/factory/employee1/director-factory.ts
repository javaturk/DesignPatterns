import {Factory} from "./factory";
import {Director} from "./director";
import {EmployeeRandomizer} from "../employee-randomizer";

export class DirectorFactory implements Factory {
  create(): Director {
    return new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
        EmployeeRandomizer.createYear(), "Management", "Management", 5000);
  }
}