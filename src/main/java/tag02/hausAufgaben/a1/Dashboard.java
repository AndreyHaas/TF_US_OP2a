package tag02.hausAufgaben.a1;

class Dashboard implements IObserver {
  private SensorDaten sensorDaten;

  public Dashboard(SensorDaten sensorDaten) {
    this.sensorDaten = sensorDaten;
    this.sensorDaten.addObserver(this);
  }

  @Override
  public void update() {
    display();
  }

  public void display() {
    System.out.println("[Dashboard] Aktuelle Werte - Temperatur: " +
        sensorDaten.getTemperatur() + "°C, Luftfeuchtigkeit: " +
        sensorDaten.getLuftfeuchtigkeit() + "%");
  }
}