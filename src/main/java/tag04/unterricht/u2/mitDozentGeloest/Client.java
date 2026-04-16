package tag04.unterricht.u2.mitDozentGeloest;

public class Client {

  public static void main(String[] args) {
    TeperaturSensor sensor = new TeperaturSensor();

    System.out.printf("%.2f %s\n\n", sensor.getTemperatur(), sensor.getEinheit());

    TemperaturSensorCelsius umgerechnet = new TemperaturSensorCelsius(sensor);

    System.out.printf("%.2f %s\n\n", umgerechnet.getTemperatur(), umgerechnet.getEinheit());
  }
}