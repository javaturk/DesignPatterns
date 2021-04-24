import {Client} from "../sol2/client";
import {GUIFactory} from "../sol2/gui-factory";
import {WinFactory} from "./win-factory";
import {OSXFactory} from "./osx-factory";

export class Test {
  public static main() {
    new Client(this.createOsSpecificFactory());
  }

  public static createOsSpecificFactory(): GUIFactory {
    const sys = this.readFromConfigFile("OS_TYPE");
    if (sys) {
      return new WinFactory();
    } else {
      return new OSXFactory();
    }
  }

  private static readFromConfigFile(file: string): boolean {
    return Math.random() > 0.5;
  }
}

Test.main();