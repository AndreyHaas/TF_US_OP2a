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
    if (betrag > 0 && betrag <= guthaben) {
      guthaben -= betrag;
    }

    return guthaben;
  }

  public double getGuthaben() {
    return guthaben;
  }
}