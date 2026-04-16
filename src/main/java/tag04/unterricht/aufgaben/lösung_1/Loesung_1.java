package tag04.unterricht.aufgaben.lösung_1;

/* Sie möchten ein Programm zur Verarbeitung der Temperaturdaten eines Temperatursensors schreiben.
 * Der Sensor, den Sie verwenden, kommt mit einer fertigen Klasse "TemperaturSensor". Diese Klasse liefert die Temperatur allerdings nur in Kelvin zurück.
 * Für Ihre Anwendung möchten sie statt Kelvin, Grad Celsius verwenden. Den Code der TemperaturSensor-Klasse können Sie aber nicht verändern, da die Klasse nur kompiliert ausgeliefert wurde. Darum entscheiden Sie sich, das Adapter-Pattern umzusetzen.
 *
 * Für diese Übung werden Sie die einfache TemperaturSensor-Klasse selbst schreiben.
 * Die TemperaturSensor-Klasse besteht aus einer getTemperatur() Methode, die einen double-Wert zurückliefert. In dieser Übung wird die Temperatur zufällig ermittelt.
 * Außerdem kann die Klasse die verwendete Maßeinheit über getEinheit() als String zurückgeben.
 *
 * Implementieren Sie eine Adapter-Klasse TemperaturSensorCelsius, die die gemessene Temperatur in Celsius konvertieren kann.
 * Erstellen Sie ein UML-Klassendiagramm und den passenden Java Code. Testen Sie das Programm.
 */

public class Loesung_1 {

  private static TemperaturSensor sensor;

  public static void main(String[] args) {
    sensor = new TemperaturSensor();
    display();
    sensor = new TemperaturSensorCelsius(sensor);
    display();
  }

  public static void display() {
    System.out.println(sensor.getTemperatur() + " " + sensor.getEinheit());
  }

}
