package tag02.hausAufgaben.a1;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse SensorDaten - das Subjekt (Observable)
 * - beinhaltet die aktuellen Messwerte des Sensors
 * - Observer-Liste (addObserver, removeObserver)
 * - notifyObservers() bei Aktualisierung
 * - getMesswerte() fuer Observer
 */
class SensorDaten {
  private List<IObserver> observerListe = new ArrayList<>();
  private double temperatur;
  private double luftfeuchtigkeit;

  public void addObserver(IObserver observer) {
    observerListe.add(observer);
    System.out.println("Observer hinzugefuegt: " + observer.getClass().getSimpleName());
  }

  // Observer austragen
  public void removeObserver(IObserver observer) {
    observerListe.remove(observer);
    System.out.println("Observer entfernt: " + observer.getClass().getSimpleName());
  }

  // Alle Observer benachrichtigen
  private void notifyObservers() {
    for (IObserver observer : observerListe) {
      observer.update();
    }
  }

  // Messwerte aktualisieren
  public void setMesswerte(double temperatur, double luftfeuchtigkeit) {
    this.temperatur = temperatur;
    this.luftfeuchtigkeit = luftfeuchtigkeit;
    System.out.println("\n[Sensor] Neue Messwerte: " + temperatur + "°C, " + luftfeuchtigkeit + "%");
    notifyObservers();
  }

  // Getter fuer Observer (Abfrage der Messwerte)
  public double getTemperatur() {
    return temperatur;
  }

  public double getLuftfeuchtigkeit() {
    return luftfeuchtigkeit;
  }
}