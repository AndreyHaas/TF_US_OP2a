package tag04.hausAufgabe.ha1;

// ============================================================
// ADAPTER-Klasse: Wandelt Kelvin in Celsius um
// ============================================================
public class TemperaturSensorCelsius {
    private final TemperaturSensor sensor;

    public TemperaturSensorCelsius(TemperaturSensor sensor) {
        this.sensor = sensor;
    }

    // Konvertiert Kelvin nach Celsius
    public double getTemperaturCelsius() {
        return sensor.getTemperatur() - 273.15;
    }

    public String getEinheit() {
        return "Celsius";
    }
}
