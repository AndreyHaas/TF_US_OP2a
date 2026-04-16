package tag04.hausAufgabe.ha1;

import java.util.Random;

// ============================================================
// Klasse TemperaturSensor (Adaptee - kann nicht geaendert werden)
// Liefert Temperatur in Kelvin
// ============================================================
public class TemperaturSensor {
  private final Random zufallsGenerator;

  public TemperaturSensor() {
    this.zufallsGenerator = new Random();
  }

  // Liefert zufaellige Temperatur in Kelvin (zwischen 250K und 310K)
  public double getTemperatur() {
    return 250.0 + zufallsGenerator.nextDouble() * 60.0;
  }

  public String getEinheit() {
    return "Kelvin";
  }
}

