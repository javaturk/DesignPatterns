import {USPowerSource} from "../domain/us/us-power-source";
import {USPowerProvider} from "../domain/us/us-power-provider";
import {USTurkishPowerAdapter} from "./us-turkish-power-adapter";
import {TurkishHomeAppliance} from "../domain/tr/turkish-home-appliance";
import {Appliance} from "../domain/tr/appliance";

export class Test {
  static main() {
    const usPowerSource: USPowerSource = new USPowerProvider();
    const usTurkishPowerAdapter: USTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);

    console.log("\n");

    const turkishMixer: Appliance = new TurkishHomeAppliance("Mixer");
    turkishMixer.setPowerSource(usTurkishPowerAdapter);
    turkishMixer.start();
    turkishMixer.stop();

    console.log("\n");

    const turkishBroom: Appliance = new TurkishHomeAppliance("Broom");
    turkishBroom.setPowerSource(usTurkishPowerAdapter);
    turkishBroom.start();
    turkishBroom.stop();
  }
}

Test.main();