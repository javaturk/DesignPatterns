import {TurkishPowerSource} from "./turkish-power-source";
import {TurkishPowerProvider} from "./turkish-power-provider";
import {Appliance} from "./appliance";
import {TurkishHomeAppliance} from "./turkish-home-appliance";

export class Test {
  static main() {
    const turkishPowerSource: TurkishPowerSource = new TurkishPowerProvider();

    const turkishMixer: Appliance = new TurkishHomeAppliance("Mixer");
    turkishMixer.setPowerSource(turkishPowerSource);
    turkishMixer.start();
    turkishMixer.stop();

    console.log("\n");

    const turkishBroom: Appliance = new TurkishHomeAppliance("Broom");
    turkishBroom.setPowerSource(turkishPowerSource);
    turkishBroom.start();
    turkishBroom.stop();
  }
}

Test.main();