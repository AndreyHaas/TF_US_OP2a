package tag01.aufgaben.lösung_4.strategie;

public class UPS implements VersandkostenStrategie {

    @Override
    public double berechneVersandkosten() {
        return 3.50d;
    }
}
