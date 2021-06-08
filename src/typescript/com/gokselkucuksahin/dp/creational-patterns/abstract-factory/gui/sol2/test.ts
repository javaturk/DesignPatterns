import {Client} from "./client";
import {GUIFactoryImpl} from "./gui-factory-impl";

export class Test {
  static main() {
    new Client(new GUIFactoryImpl());
  }
}

Test.main();