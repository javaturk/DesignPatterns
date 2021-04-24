import {Factory} from "./factory";
import {Employee} from "../employee1/employee";
import {EmployeeRandomizer} from "../employee-randomizer";

export class EmployeeFactory implements Factory {
  create(name: string): Employee {
    return new Employee(EmployeeRandomizer.createId(), name,
        EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
  }
}