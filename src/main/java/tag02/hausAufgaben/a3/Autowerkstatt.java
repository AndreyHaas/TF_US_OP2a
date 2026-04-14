package tag02.hausAufgaben.a3;

public class Autowerkstatt {
  public static void main(String[] args) {

    Werkstatt werkstatt = new Werkstatt();

    Kunde kunde = new Kunde("Hans Mueller", 1001, "+49 170 1234567");

    Fahrzeug fahrzeug = new Fahrzeug("M-AB 123");

    System.out.println("=== Auftragserfassung ===");
    werkstatt.erfasseAuftrag(fahrzeug, kunde);

    werkstatt.zeigeAlleAuftraege();

    System.out.println("=== Fahrzeug wird bearbeitet ===");
    fahrzeug.setBearbeitet(true);

    System.out.println("Fahrzeug Status: " + fahrzeug);
  }
}