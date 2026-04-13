package tag01.aufgaben.lösung_4.strategie;

public class Main {
    public static void main(String[] args) {
        Adresse zielort = new Adresse("Hendrick", "Zuhause 12", "Dortmund", "40330", "Deutschland");
        Adresse herkunfstort = new Adresse("Gabi", "Wegstraße 33", "Berlin", "12345", "Deutschland");
        Bestellung bestellung = new Bestellung(new DHL(), zielort, herkunfstort);

        // Service zum Berechnen der Versandkosten.
        VersandkostenBerechnungsService v1 = new VersandkostenBerechnungsService();
        v1.setVersandkostenStrategie(bestellung.getVersandkostenStrategie());
        System.out.println(v1.getVersandkostenStrategie().getClass().getSimpleName());
        System.out.println(v1.berechneVersandkosten());
    }
}
