package tag03.unterricht;

public class Pizza implements ProduktGericht {
    //2. Wir erstellen Produktklassen, die jeweils auf verschiedene Weise das Interface implementieren.
    private int durchmesser;
    private double preis;
    private String nameDerSorte;

    public Pizza(int durchmesser, double preis, String nameDerSorte) {
        this.preis = preis;
        this.durchmesser = durchmesser;
        this.nameDerSorte = nameDerSorte;
    }

    @Override
    public String liefertProduktinfos() {
        return "Pizza: \n\tSorte: " + nameDerSorte + "\n\tPreis: " + preis + " €\n\tDurchmesser: " + durchmesser + " cm";
    }
}