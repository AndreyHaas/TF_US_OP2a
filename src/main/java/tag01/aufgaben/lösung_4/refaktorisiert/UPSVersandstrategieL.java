package tag01.aufgaben.lösung_4.refaktorisiert;

//Eine konkrete Strategie für Refaktorisierung mit Strategiemuster.
public class UPSVersandstrategieL implements VersandStrategieL {

    @Override
    public double berechneVersandkosten(Bestellung bestellung) {
        return 4.00d;
    }
}
