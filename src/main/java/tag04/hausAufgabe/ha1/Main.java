package tag04.hausAufgabe.ha1;

public class Main {
  public static void main(String[] args) {

    TemperaturSensor sensor = new TemperaturSensor();

    TemperaturSensorCelsius adapter = new TemperaturSensorCelsius(sensor);

    System.out.println("=== Temperaturmessungen ===");

    for (int i = 1; i <= 10; i++) {
      double kelvin = sensor.getTemperatur();
      double celsius = adapter.getTemperaturCelsius();

      System.out.println("Messung " + i + ":");
      System.out.println("  Sensor (Kelvin):  " + String.format("%.2f", kelvin) + " " + sensor.getEinheit());
      System.out.println("  Adapter (Celsius): " + String.format("%.2f", celsius) + " " + adapter.getEinheit());
      System.out.println();
    }
  }
}
