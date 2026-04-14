package tag02.Zusatzbeispiel2WebShop;

import java.util.ArrayList;
import java.util.List;

public class Webshop {

  //Alle Beobachter werden in einer Liste oder einem Array gespeichert
  private List<Beobachter> newsletterAbonenten = new ArrayList<>();
  private ArrayList<String> produktkatalog = new ArrayList<>();

  public void abonnentenHinzufuegen(Beobachter b) {
    newsletterAbonenten.add(b);
  }

  public void abonnentenEntfernen(Beobachter b) {
    newsletterAbonenten.remove(b);
  }

  // Diese Methode informiert alle Observer/ Beobachter über den geänderten Zustand
  private void versendeNewsletter(ArrayList<String> produktkatalog) {
    // Jeder Beobachter aus der Liste 'newsletterAbonenten' wird pro Schleifendurchlauf aufgerufen
    for (Beobachter beobachter : newsletterAbonenten) {
      beobachter.update(produktkatalog);
    }
  }

  public void proukteHizufuegen(String s) {
    produktkatalog.add(s);
  }

  // Diese Methode ändert den Zustand des Objektes.
  // Hier geschieht etwas Wichtiges, worüber Abonnenten benachrichtigt werden müssen.
  public void neuerProduktkatalogVersenden() {
    versendeNewsletter(produktkatalog);
  }
}