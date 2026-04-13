package tag01.aufgaben.lösung_4.refaktorisiert;

// Der nach dem Strategiemuster refaktorisierte Service.
public class VersandkostenBerechnungsServiceL {

    private VersandStrategieL versandStrategie;

    public void setVersandkostenBerechnungMitStrategie(VersandStrategieL versandStrategie) {
        this.versandStrategie = versandStrategie;
    }

    public double berechneVersandkosten(Bestellung bestellung) {
        return versandStrategie.berechneVersandkosten(bestellung);
    }
}
