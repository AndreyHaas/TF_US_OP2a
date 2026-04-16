package tag04.unterricht.aufgaben.lösung_1v2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperaturSensorCelsius implements AdapterInterface {

  private final TemperaturSensor temperaturSensor;

  public TemperaturSensorCelsius(TemperaturSensor temperaturSensor) {
    this.temperaturSensor = temperaturSensor;
  }

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
