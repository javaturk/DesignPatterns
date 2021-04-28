import {Factory} from "./factory";
import {Manager} from "./manager";
import {EmployeeRandomizer} from "../employee-randomizer";

export class ManagerFactory implements Factory {
  create(): Manager {
    const department = EmployeeRandomizer.createDepartment();
    return new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
        EmployeeRandomizer.createYear(), department, department);
  }
}