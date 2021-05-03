export interface TurkishPowerSource {
  providePowerAt220V(): void;

  turnOn(): void;

  turnOff(): void;
}