package tag04.unterricht.u2.mitDozentGeloest;

public class TemperaturSensorCelsius implements ClientInterface {

  public TeperaturSensor sensor;
  private static final double umrechenWert = 273.15;

  public TemperaturSensorCelsius(TeperaturSensor sensor) {
    this.sensor = sensor;
  }

  @Override
  public double getTemperatur() {
    return convertKelvinInCelsius();
  }

  @Override
  public String getEinheit() {
    return "Celsius";
  }

  private double convertCelsiusInKelvin() {
    return convertKelvinInCelsius() + umrechenWert;
  }

  private double convertKelvinInCelsius() {
    double celsius = sensor.getTemperatur() - umrechenWert;
    return celsius;

    // Kurzschreibweise direkt hinter return
    // return sensor.getTemperatur() -272.15
  }
}
