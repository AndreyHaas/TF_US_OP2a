package tag04.unterricht.aufgaben.lösung_1v2;

public class Lösung_1v2 {

  public static void main(String[] args) {
    TemperaturSensor tempSensor = new TemperaturSensor();
    System.out.println(tempSensor.getTemperatur() + " " + tempSensor.getEinheit());

    AdapterInterface sensor = new TemperaturSensorCelsius(tempSensor);
    System.out.println(sensor.getTemperatur() + " " + sensor.getEinheit());
  }
}
