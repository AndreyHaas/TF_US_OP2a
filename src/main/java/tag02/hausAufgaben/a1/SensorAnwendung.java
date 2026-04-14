package tag02.hausAufgaben.a1;

public class SensorAnwendung {
  public static void main(String[] args) {

    SensorDaten sensor = new SensorDaten();

    History history = new History(sensor);

    System.out.println("\n=== Sensor Anwendung gestartet ===\n");

    sensor.setMesswerte(22.5, 55.0);
    sensor.setMesswerte(23.1, 58.3);
    sensor.setMesswerte(21.8, 52.7);

    System.out.println("\n=== Entferne History Observer ===\n");
    sensor.removeObserver(history);

    sensor.setMesswerte(20.5, 50.0);
  }
}