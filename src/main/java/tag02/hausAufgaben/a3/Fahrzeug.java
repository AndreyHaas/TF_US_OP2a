package tag02.hausAufgaben.a3;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeug {
  private String kennzeichen;
  private boolean bearbeitet;
  private List<IObserver> observerListe = new ArrayList<>();

  public Fahrzeug(String kennzeichen) {
    this.kennzeichen = kennzeichen;
    this.bearbeitet = false;
  }

  // Observer hinzufuegen
  public void addObserver(IObserver observer) {
    observerListe.add(observer);
  }

  // Observer entfernen
  public void removeObserver(IObserver observer) {
    observerListe.remove(observer);
  }

  // Alle Observer benachrichtigen
  private void notifyObservers() {
    String nachricht = "Fahrzeug " + kennzeichen + " wurde bearbeitet!";
    for (IObserver observer : observerListe) {
      observer.update(nachricht);
    }
  }

  // Setter fuer bearbeitet - loest Benachrichtigung aus
  public void setBearbeitet(boolean bearbeitet) {
    this.bearbeitet = bearbeitet;
    if (bearbeitet) {
      notifyObservers();
    }
  }

  public boolean isBearbeitet() {
    return bearbeitet;
  }

  public String getKennzeichen() {
    return kennzeichen;
  }

  @Override
  public String toString() {
    return "Fahrzeug [Kennzeichen=" + kennzeichen + ", bearbeitet=" + bearbeitet + "]";
  }
}
