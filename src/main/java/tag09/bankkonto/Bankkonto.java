package tag09.bankkonto;

public class Bankkonto {

  private double guthaben;

  public Bankkonto(double guthaben) {
    this.guthaben = guthaben;
  }

  public double einzahlen(double betrag) {
    if (betrag > 0) {
      guthaben += betrag;
    }
    return guthaben;
  }

  public double abheben(double betrag) {
    // NUR Geldabheben, falls 'betrag' > 0 UND Bankkonto darf nicht ins Minus kommen
    if (betrag > 0 && betrag <= guthaben) {
      guthaben -= betrag;
    }
    return guthaben;
  }

  public double getGuthaben() {
    return guthaben;
  }
}