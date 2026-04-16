package tag04.unterricht.u2;

public class TemperaturSensorCelsius implements IClient {

  public static final double UMRECHENWERT = 273.15;
  private final TemperaturSensor temperaturSensor;

  public TemperaturSensorCelsius(TemperaturSensor temperaturSensor) {
    this.temperaturSensor = temperaturSensor;
  }

  @Override
  public double getTemperatur() {
    return temperaturSensor.getTemperatur();
  }

  @Override
  public String getEinheit() {
    return temperaturSensor.getEinheit();
  }

  private double convertCelsiusInKelvin() {
    return convertKelvinInCelsius() + UMRECHENWERT;
  }

  private double convertKelvinInCelsius() {
    return temperaturSensor.getTemperatur() - UMRECHENWERT;
  }
}