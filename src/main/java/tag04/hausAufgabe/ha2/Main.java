package tag04.hausAufgabe.ha2;


public class Main {
  public static void main(String[] args) {
    // Runden Loch mit Radius 5 erstellen
    RundesLoch loch = new RundesLoch(5.0);

    System.out.println("=== Test mit runden Stoepseln ===");

    // Runde Stoepsel testen
    RunderStoepsel runderStoepsel1 = new RunderStoepsel(4.0);
    RunderStoepsel runderStoepsel2 = new RunderStoepsel(6.0);

    System.out.println("Runder Stoepsel mit Radius 4.0 passt: "
        + loch.pruefeObStoepselPasst(runderStoepsel1));
    System.out.println("Runder Stoepsel mit Radius 6.0 passt: "
        + loch.pruefeObStoepselPasst(runderStoepsel2));

    System.out.println("\n=== Test mit quadratischen Stoepseln (ueber Adapter) ===");

    // Quadratische Stoepsel erstellen
    QuadratischerStoepsel quadratStoepsel1 = new QuadratischerStoepsel(6.0);  // Seitenlaenge 6
    QuadratischerStoepsel quadratStoepsel2 = new QuadratischerStoepsel(8.0);  // Seitenlaenge 8

    QuadratAdapter adapter1 = new QuadratAdapter(quadratStoepsel1);
    QuadratAdapter adapter2 = new QuadratAdapter(quadratStoepsel2);

    // Berechnung zur Kontrolle
    double radius1 = (6.0 * Math.sqrt(2)) / 2;
    double radius2 = (8.0 * Math.sqrt(2)) / 2;
    System.out.println("Seitenlaenge 6.0 -> Radius: " + radius1);
    System.out.println("Seitenlaenge 8.0 -> Radius: " + radius2);

    // Testen ob quadratische Stoepsel in rundes Loch passen
    System.out.println("\nQuadratischer Stoepsel (Breite 6.0) passt: "
        + loch.pruefeObStoepselPasst(adapter1));
    System.out.println("Quadratischer Stoepsel (Breite 8.0) passt: "
        + loch.pruefeObStoepselPasst(adapter2));
  }
}
