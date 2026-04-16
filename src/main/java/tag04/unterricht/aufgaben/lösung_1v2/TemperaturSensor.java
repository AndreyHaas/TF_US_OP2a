package tag04.unterricht.aufgaben.lösung_1v2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class TemperaturSensor {

  private final Random random = new Random();

  // Beispieldaten zum Testen, normalerweise würde die getTemperatur() Methode die aktuellen Messwerte vom Gerät abfragen, aber wir haben ja kein Gerät ^^
  // BigDecimal: Ein Datentyp für Fließkommazahlen mit hoher Genauigkeit
  // valueOf() erzeugt ein BigDecimal-Objekt.
  // Erzeugt eine Zufallszahl von 270 bis 310.
  // setScale rundet die erzeugte Zahl auf zwei Nachkommastellen.
  // doubleValue() konvertiert BigDecimal zu double.
  private double temperatur = BigDecimal.valueOf((310 - 270) * random.nextDouble() + 270)
      .setScale(2, RoundingMode.HALF_UP).doubleValue();

  /**
   * @return Die gemessene Temperatur
   */
  public double getTemperatur() {
    return temperatur;
  }

  /**
   * @return Die Maßeinheit dieses Sensors
   */
  public String getEinheit() {
    return "Kelvin";
  }
}

