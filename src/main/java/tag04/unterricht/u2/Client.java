package tag04.unterricht.u2;

public class Client {

  public static void main(String[] args) {
    TemperaturSensor temperaturSensor = new TemperaturSensor();
    System.out.println(temperaturSensor.getTemperatur() + " " + temperaturSensor.getEinheit());

    TemperaturSensorCelsius sensorCelsius = new TemperaturSensorCelsius(new TemperaturSensor());
    System.out.println(sensorCelsius.getTemperatur() + " " + sensorCelsius.getEinheit());
  }
}
