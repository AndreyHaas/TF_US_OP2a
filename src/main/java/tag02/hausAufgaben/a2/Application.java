package tag02.hausAufgaben.a2;

public class Application {

  public static void main(String[] args) {

    Einkaufzentrum einkaufzentrum = new Einkaufzentrum();

    Mitarbeiter mitarbeiter = new Mitarbeiter();
    Geschaeftsfuehrer chef = new Geschaeftsfuehrer();

    System.out.println("=== Event abonnieren ===");
    einkaufzentrum.addGruesser(mitarbeiter);
    einkaufzentrum.addGruesser(chef);

    System.out.println("\n=== Kunde kommt ===");
    einkaufzentrum.neuerKundeBetrittDasGebaeude();

    System.out.println("=== Noch ein Kunde ===");
    einkaufzentrum.neuerKundeBetrittDasGebaeude();
  }
}
