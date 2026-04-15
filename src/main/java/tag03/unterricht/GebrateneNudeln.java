package tag03.unterricht;

public class GebrateneNudeln implements ProduktGericht {
    //2. Wir erstellen Produktklassen, die jeweils auf verschiedene Weise das Interface implementieren.

    private double preis;
    private String variante; //vegetarisch oder mit Ente oder geräucherter Fisch

    public GebrateneNudeln(double preis, String variante) {
        this.preis = preis;
        this.variante = variante;
    }

    // Methode aus Interface muss implementiert werden
    @Override
    public String liefertProduktinfos() {
        return "Gebratene Nudeln - " + variante + ":\n\tPreis: " + preis + " €";
    }

}
