package tag04.hausAufgabe.ha1;

// ============================================================
// ADAPTER-Klasse: Wandelt Kelvin in Celsius um
// ============================================================
public class TemperaturSensorCelsius {
  private TemperaturSensor sensor;

  public TemperaturSensorCelsius(TemperaturSensor sensor) {
    this.sensor = sensor;
  }

  // Konvertiert Kelvin nach Celsius
  public double getTemperaturCelsius() {
    double kelvin = sensor.getTemperatur();
    return kelvin - 273.15;
  }

  public String getEinheit() {
    return "Celsius";
  }
}
