package tag01.aufgaben.lösung_4.refaktorisiert;

//Eine konkrete Strategie für Refaktorisierung mit Strategiemuster.
public class HermesVersandStrategieL implements VersandStrategieL {

    @Override
    public double berechneVersandkosten(Bestellung bestellung) {
        return 2.95d;
    }
}
