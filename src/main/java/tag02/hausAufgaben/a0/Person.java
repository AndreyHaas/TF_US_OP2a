package tag02.hausAufgaben.a0;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse "Person" - das Subjekt (Observable) - eine Liste vom Typ Feuerloescher - eine void Methode
 * "feuerRufen()", die "Feuer!" auf der Konsole ausgibt und fuer alle Feuerloescher die Methode
 * aufruft - eine weitere Methode zum Hinzufuegen neuer Feuerloescher
 */
class Person {

  private List<Feuerloescher> feuerloescherListe = new ArrayList<>();

  /**
   * Methode zum Hinzufuegen neuer Feuerloescher
   */
  public void addFeuerloescher(Feuerloescher feuerloescher) {
    feuerloescherListe.add(feuerloescher);
    System.out.println(
        "Feuerloescher wurde hinzugefuegt: " + feuerloescher.getClass().getSimpleName());
  }

  /**
   * Feuer rufen - benachrichtigt alle angemeldeten Feuerloescher
   */
  public void feuerRufen() {
    System.out.println("\n🔥 FEUER! 🔥");
    System.out.println("-------------------");

    for (Feuerloescher feuerloescher : feuerloescherListe) {
      feuerloescher.feuerLoeschen();
    }

    System.out.println("-------------------\n");
  }
}