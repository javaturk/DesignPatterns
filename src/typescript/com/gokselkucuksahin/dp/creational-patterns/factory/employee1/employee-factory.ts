import {Factory} from "./factory";
import {Employee} from "./employee";
import {EmployeeRandomizer} from "../employee-randomizer";

export class EmployeeFactory implements Factory {
  create(): Employee {
    return new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
        EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
  }
}