import {Client} from "./client";
import {ButtonFactory} from "./button-factory";
import {ListFactory} from "./list-factory";
import {TableFactory} from "./table-factory";

export class Test {
  static main() {
    new Client(new ButtonFactory());
    new Client(new ListFactory());
    new Client(new TableFactory());
  }
}

Test.main();