export interface USPowerSource {
  providePowerAt110V(): void;

  pushSwitch(): void;
}