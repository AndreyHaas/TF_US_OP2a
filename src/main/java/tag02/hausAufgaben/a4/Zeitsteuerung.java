package tag02.hausAufgaben.a4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Zeitsteuerung {
  private List<Kunde> kunden;
  private LocalDate startDatum;
  private int tage;

  public Zeitsteuerung(List<Kunde> kunden, LocalDate startDatum, int tage) {
    this.kunden = kunden;
    this.startDatum = startDatum;
    this.tage = tage;
  }

  public void starteSimulation() throws InterruptedException {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    System.out.println("=== SIMULATION STARTET ===\n");

    for (int i = 0; i < tage; i++) {
      LocalDate aktuellesDatum = startDatum.plusDays(i);
      System.out.println("📅 Datum: " + aktuellesDatum.format(formatter));

      for (Kunde kunde : kunden) {
        kunde.pruefeGeburtstag(aktuellesDatum);
      }

      System.out.println();

      try {
        Thread.sleep(100); // 100 Millisekunden warten
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("=== SIMULATION BEENDET ===");
  }
}