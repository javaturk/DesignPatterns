import {TurkishPowerSource} from "../domain/tr/turkish-power-source";
import {TurkishPowerProvider} from "../domain/tr/turkish-power-provider";
import {TurkishHomeApplianceCompatibleWithUsPowerSource} from "./turkish-home-appliance-compatible-with-us-power-source";
import {USPowerSource} from "../domain/us/us-power-source";
import {USPowerProvider} from "../domain/us/us-power-provider";

export class Test {
  static main() {
    const turkishPowerSource: TurkishPowerSource = new TurkishPowerProvider();

    // Can't have a reference of type Appliance anymore
    const turkishMixer = new TurkishHomeApplianceCompatibleWithUsPowerSource("Mixer");
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