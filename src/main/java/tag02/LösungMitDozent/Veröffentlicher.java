package tag02.LösungMitDozent;

import java.util.ArrayList;
import java.util.List;

public class Veröffentlicher {
  // Erstelle die Publisher Klasse. Die Publisher Klasse enthält ein Listen oder Array Attribut vom Typ des Beobachter Interfaces.
  // Der Publisher braucht außerdem öffentliche Methoden um Beobachter/Abonnenten der Liste
  // bzw. dem Array hinzuzufügen und wieder aus der Liste zu entfernen. Dem Publisher implementieren wir außerdem eine Methode um
  // die Beobachter zu benachrichtigen, wenn es interessante Änderungen gibt. Mit der Benachrichtigungsmethode wird der Publisher
  // über seine Liste iterieren und für alle interessierten Beobachter deren update() Methode aufrufen.

  // Beobachterliste
  private List<Beobachter> beobachterListe;

  public Veröffentlicher() {
    beobachterListe = new ArrayList<>();
  }

  // Methode um Beobachter hinzuzufügen
  public void fügeBeobachterHinzu(Beobachter b) {
    beobachterListe.add(b);
  }

  // Methode um Beobachter zu entfernen
  public void entferneBeobachter(Beobachter b) {
    beobachterListe.remove(b);
  }

  // Benachrichtigen von Beobachtern
  public void benachrichtigeBeobachter(String s) {
    // Jeder Beobachter in der Liste möchte informiert werden
    // also jeder Beobachter möchte ein update bekommen
    for (Beobachter beobachter : beobachterListe) {
      beobachter.update(s);
    }
  }


}
