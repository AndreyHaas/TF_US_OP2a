package tag01.aufgaben.lösung_4.strategie;

public class VersandkostenBerechnungsService {
    private VersandkostenStrategie versandkostenStrategie;

    public VersandkostenStrategie getVersandkostenStrategie() {
        return versandkostenStrategie;
    }

    public void setVersandkostenStrategie(VersandkostenStrategie versandkostenStrategie) {
        this.versandkostenStrategie = versandkostenStrategie;
    }

    public double berechneVersandkosten() {
        return versandkostenStrategie.berechneVersandkosten();
    }
}
