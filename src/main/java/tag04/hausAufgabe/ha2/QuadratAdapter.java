package tag04.hausAufgabe.ha2;

// ============================================================
// ADAPTER - erbt von RunderStoepsel und aggregiert QuadratischerStoepsel
// ============================================================
public class QuadratAdapter extends RunderStoepsel {
  private QuadratischerStoepsel quadratStoepsel;

  public QuadratAdapter(QuadratischerStoepsel quadratStoepsel) {
    super(0); // Dummy-Wert, wird ueberschrieben
    this.quadratStoepsel = quadratStoepsel;
  }

  @Override
  public double getRadius() {
    // Radius eines Quadrats = (Seitenlaenge * Wurzel(2)) / 2
    double seitenlaenge = quadratStoepsel.getBreite();
    return (seitenlaenge * Math.sqrt(2)) / 2;
  }
}
