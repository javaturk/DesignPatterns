import {Factory} from "./factory";
import {Manager} from "../employee1/manager";
import {EmployeeRandomizer} from "../employee-randomizer";

export class ManagerFactory implements Factory {
  public create(name: string): Manager {
    const department = EmployeeRandomizer.createDepartment();
    return new Manager(EmployeeRandomizer.createId(), name,
        EmployeeRandomizer.createYear(), department, department);
  }
}