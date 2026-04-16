package tag04.unterricht.u2.mitDozentGeloest;

import java.util.Random;

public class TeperaturSensor {
  // Für diese Übung werden Sie die einfache TemperaturSensor-Klasse selbst schreiben.
  // * Die TemperaturSensor-Klasse besteht aus einer getTemperatur() Methode, die einen double-Wert zurückliefert.
  //   In dieser Übung wird die Temperatur zufällig ermittelt.
  // * Außerdem kann die Klasse die verwendete Maßeinheit über getEinheit() als String zurückgeben.

  Random random = new Random();

  // Werte von 240 - 320
  // 240 + (Wert zwischen 0 und 1) * 80 = 240 bis 320
  private double messwertKelvin = 240 + random.nextDouble() * 80;

  public double getTemperatur() {
    return messwertKelvin;
  }

  public void setMesswertKelvin(double messwertKelvin) {
    this.messwertKelvin = messwertKelvin;
  }

  public String getEinheit() {
    return "Kelvin";
  }
}
