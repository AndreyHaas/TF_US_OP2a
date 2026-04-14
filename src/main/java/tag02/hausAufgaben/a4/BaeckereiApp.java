package tag02.hausAufgaben.a4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BaeckereiApp {

  public static void main(String[] args) {
    Baeckerei baeckerei = new Baeckerei("Familien-Baeckerei Schmidt");

    List<Kunde> kunden = new ArrayList<>();

    Kunde anna = new Kunde("Anna Meier", LocalDate.of(1990, 3, 15), "Schokolade");
    Kunde thomas = new Kunde("Thomas Weber", LocalDate.of(1985, 3, 16), "Erdbeere");
    Kunde lisa = new Kunde("Lisa Hoffmann", LocalDate.of(1995, 3, 15), "Vanille");
    Kunde peter = new Kunde("Peter Schmidt", LocalDate.of(1988, 3, 20), "Kirsche");

    kunden.add(anna);
    kunden.add(thomas);
    kunden.add(lisa);
    kunden.add(peter);

    System.out.println("=== KUNDENLISTE ===");
    for (Kunde kunde : kunden) {
      kunde.addBeobachter(baeckerei);
      System.out.println(kunde);
    }

    System.out.println("\n=== BACKEREI ===");
    System.out.println(baeckerei.getName() + " ist fuer alle Kunden als Beobachter registriert.\n");

    LocalDate startDatum = LocalDate.of(2025, 3, 14);
    int anzahlTage = 10;

    Zeitsteuerung zeitreise = new Zeitsteuerung(kunden, startDatum, anzahlTage);
    zeitreise.starteSimulation();

    System.out.println("\n=== ZUSAMMENFASSUNG ===");
    System.out.println("Simulierte Tage: " + anzahlTage);
    System.out.println("Kunden mit Geburtstag im Zeitraum:");
    for (Kunde kunde : kunden) {
      LocalDate geburtstag = kunde.getGeburtstag();
      if (geburtstag.getMonthValue() == 3 &&
          geburtstag.getDayOfMonth() >= 14 &&
          geburtstag.getDayOfMonth() <= 23) {
        System.out.println("  - " + kunde.getName() + " am " +
            geburtstag.getDayOfMonth() + "." + geburtstag.getMonthValue() + ".");
      }
    }
  }
}