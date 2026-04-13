package tag01.aufgaben.lösung_4.strategie;

public class DHL implements VersandkostenStrategie {

    @Override
    public double berechneVersandkosten() {
        return 4.00d;
    }
}
