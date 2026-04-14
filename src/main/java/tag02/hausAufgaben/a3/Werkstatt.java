package tag02.hausAufgaben.a3;

import java.util.HashMap;
import java.util.Map;

/**
 * Klasse Werkstatt - implementiert IObserver
 * - Map "Auftraege" (Fahrzeug -> Kunde)
 * - Methode zur Erfassung der Auftraege
 * - SMS-Versand (Konsolenausgabe)
 */
class Werkstatt implements IObserver {
  private Map<Fahrzeug, Kunde> auftraege = new HashMap<>();

  public void erfasseAuftrag(Fahrzeug fahrzeug, Kunde kunde) {
    auftraege.put(fahrzeug, kunde);
    fahrzeug.addObserver(this);
    System.out.println("Auftrag erfasst: " + fahrzeug.getKennzeichen() + " -> " + kunde.getName());
  }

  public void zeigeAlleAuftraege() {
    System.out.println("\n=== Alle Auftraege ===");
    for (Map.Entry<Fahrzeug, Kunde> entry : auftraege.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    System.out.println("=====================\n");
  }

  @Override
  public void update(String nachricht) {
    // Herausfinden, welches Fahrzeug die Benachrichtigung ausgeloest hat
    for (Map.Entry<Fahrzeug, Kunde> entry : auftraege.entrySet()) {
      Fahrzeug f = entry.getKey();
      if (f.isBearbeitet()) {
        Kunde k = entry.getValue();
        sendeSMS(k, f);
        break;
      }
    }
  }


  private void sendeSMS(Kunde kunde, Fahrzeug fahrzeug) {
    System.out.println("\n📱 SMS wird gesendet an: " + kunde.getTelefonnummer());
    System.out.println("   An: " + kunde.getName());
    System.out.println("   Ihr Fahrzeug mit Kennzeichen " + fahrzeug.getKennzeichen() + " wurde bearbeitet.");
    System.out.println("   Vielen Dank fuer Ihren Auftrag!\n");
  }
}