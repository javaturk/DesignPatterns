import {TurkishPowerProvider} from "../domain/tr/turkish-power-provider";
import {TurkishPowerSource} from "../domain/tr/turkish-power-source";
import {TurkishHomeAppliance} from "./turkish-home-appliance";
import {USPowerSource} from "../domain/us/us-power-source";
import {USPowerProvider} from "../domain/us/us-power-provider";

export class Test {
  static main() {
    const turkishPowerSource: TurkishPowerSource = new TurkishPowerProvider();

    // Can't have a reference of type Appliance anymore
    const turkishMixer = new TurkishHomeAppliance("Mixer");
    turkishMixer.setPowerSource(turkishPowerSource);
    turkishMixer.start();
    turkishMixer.stop();

    console.log("\n");

    const usPowerSource: USPowerSource = new USPowerProvider();

    turkishMixer.setUSPowerSource(usPowerSource);
    turkishMixer.start();
    turkishMixer.stop();
  }
}

Test.main();