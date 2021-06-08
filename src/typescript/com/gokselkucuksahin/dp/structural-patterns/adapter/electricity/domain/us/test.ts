import {USPowerSource} from "./us-power-source";
import {USPowerProvider} from "./us-power-provider";
import {UsHomeAppliance} from "./us-home-appliance";

export class Test {
  static main() {
    const usPowerSource : USPowerSource = new USPowerProvider();

    const usMixer = new UsHomeAppliance("Mixer");
    usMixer.setPowerSource(usPowerSource);
    usMixer.start();
    usMixer.stop();
  }
}

Test.main();