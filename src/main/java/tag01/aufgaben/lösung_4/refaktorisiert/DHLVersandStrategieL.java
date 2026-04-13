package tag01.aufgaben.lösung_4.refaktorisiert;

// Eine konkrete Strategie für Refaktorisierung mit Strategiemuster.
public class DHLVersandStrategieL implements VersandStrategieL {

    @Override
    public double berechneVersandkosten(Bestellung bestellung) {
        return 3.50d;
    }
}
