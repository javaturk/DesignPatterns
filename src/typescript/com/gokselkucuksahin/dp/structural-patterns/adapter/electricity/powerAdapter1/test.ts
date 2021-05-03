import {USPowerProvider} from "../domain/us/us-power-provider";
import {USPowerSource} from "../domain/us/us-power-source";
import {USTurkishPowerAdapter} from "./us-turkish-power-adapter";
import {Appliance} from "../domain/tr/appliance";
import {TurkishHomeAppliance} from "../domain/tr/turkish-home-appliance";

export class Test {
  static main() {
    const usPowerSource: USPowerSource = new USPowerProvider();
    const usTurkishPowerAdapter: USTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);

    console.log("\n");

    const shaver: Appliance = new TurkishHomeAppliance("Shaver");
    shaver.setPowerSource(usTurkishPowerAdapter);
    shaver.start();
    shaver.stop();
  }
}

Test.main();


