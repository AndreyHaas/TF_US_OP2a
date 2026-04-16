package tag04.unterricht.aufgaben.lösung_2;

// Mittels einer Adapterklasse bekommen wir den quadratischen Stöpsel in das runde Loch:
// Wir erweitern die bestehende, in das runde Loch, passende Klasse.
// Beispiel für Klassenadapter
public class QuadratStoepselAdapter extends RunderStoepsel {

  // Wir erschaffen eine Komposition mit einer Referenz auf den nicht passenden quadratischen Stöpsel. 
  private QuadratischerStoepsel stoepsel;

  public QuadratStoepselAdapter(QuadratischerStoepsel quadratischerStoepsel) {
    super(0);
    this.stoepsel = quadratischerStoepsel;
  }

  // Der Adapter tut nach außen so, als ob er ein runderStöpsel mit einem Radius ist, welcher dem quadratischenStöpsel entspricht,
  // der vom Adapter umwickelt wird.
  @Override
  public double getRadius() {

    return stoepsel.getBreite() * Math.sqrt(2)
        / 2; //https://sciencing.com/calculate-radius-square-2806.html
  }
}
