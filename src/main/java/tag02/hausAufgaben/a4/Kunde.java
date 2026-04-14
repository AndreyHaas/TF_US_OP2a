package tag02.hausAufgaben.a4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Kunde {
  private String name;
  private LocalDate geburtstag;
  private String lieblingsgeschmack;
  private List<IObserver> beobachterListe = new ArrayList<>();

  public Kunde(String name, LocalDate geburtstag, String lieblingsgeschmack) {
    this.name = name;
    this.geburtstag = geburtstag;
    this.lieblingsgeschmack = lieblingsgeschmack;
  }

  // Beobachter hinzufuegen (Baeckerei)
  public void addBeobachter(IObserver beobachter) {
    beobachterListe.add(beobachter);
  }

  // Beobachter entfernen
  public void removeBeobachter(IObserver beobachter) {
    beobachterListe.remove(beobachter);
  }

  // Alle Beobachter benachrichtigen
  private void notifyBeobachter() {
    for (IObserver beobachter : beobachterListe) {
      beobachter.update(name, lieblingsgeschmack);
    }
  }

  // Pruefen, ob heute Geburtstag ist
  public void pruefeGeburtstag(LocalDate aktuellesDatum) {
    if (aktuellesDatum.getMonth() == geburtstag.getMonth() &&
        aktuellesDatum.getDayOfMonth() == geburtstag.getDayOfMonth()) {
      System.out.println("🎂 GEBURTSTAG! 🎂 " + name + " hat heute Geburtstag!");
      notifyBeobachter();
    }
  }

  // Getter
  public String getName() {
    return name;
  }

  public LocalDate getGeburtstag() {
    return geburtstag;
  }

  public String getLieblingsgeschmack() {
    return lieblingsgeschmack;
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.");
    return name + " (" + geburtstag.format(formatter) + ") - Liebling: " + lieblingsgeschmack;
  }
}