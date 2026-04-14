package tag02.hausAufgaben.a1;

/**
 * Klasse History - implementiert IObserver
 * - speichert die Daten (save) - hier simuliert durch Ausgabe
 */
class History implements IObserver {
  private final SensorDaten sensorDaten;

  // Konstruktor: Observer traegt sich ein
  public History(SensorDaten sensorDaten) {
    this.sensorDaten = sensorDaten;
    this.sensorDaten.addObserver(this);
  }

  @Override
  public void update() {
    save();
  }

  public void save() {
    System.out.println("[History] Daten gespeichert - Temperatur: " +
        sensorDaten.getTemperatur() + "°C, Luftfeuchtigkeit: " +
        sensorDaten.getLuftfeuchtigkeit() + "%");
  }
}