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

    // Liefert zufaellige Temperatur in Kelvin (zwischen 240K und 320K)
    public double getTemperatur() {
        return 240.0 + zufallsGenerator.nextDouble() * 80.0;
    }

    public String getEinheit() {
        return "Kelvin";
    }
}

