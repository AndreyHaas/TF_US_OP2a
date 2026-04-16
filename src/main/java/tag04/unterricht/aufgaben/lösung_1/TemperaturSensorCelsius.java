package tag04.unterricht.aufgaben.lösung_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Diese Herangehensweise ähnelt sehr dem Decorator-Pattern. Der Unterschied ist, dass beim Decorator die Funktionalität erweitert wird, beim Adapter wird die vorhandene Funktionalität an die Bedürfnisse angepasst.
class TemperaturSensorCelsius extends TemperaturSensor {

  private TemperaturSensor temperaturSensor;

  public TemperaturSensorCelsius(TemperaturSensor temperaturSensor) {
    this.temperaturSensor = temperaturSensor;
  }

  /**
   * Fragt die aktuelle Temperatur in Kelvin des gespeicherten Sensors ab und konvertiert den Wert
   * in Celsius
   *
   * @return Die gemessene Temperatur in Celsius
   */
  @Override
  public double getTemperatur() {
    return BigDecimal.valueOf(temperaturSensor.getTemperatur() - 273.15)
        .setScale(2, RoundingMode.HALF_UP).doubleValue();
  }

  @Override
  public String getEinheit() {
    return "Grad Celsius";
  }
}
