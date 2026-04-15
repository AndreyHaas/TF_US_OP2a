package tag03.aufgaben.loesung_3;

public abstract class Computerteil {
    private String bezeichnung;
    private String hersteller;

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public Computerteil(String bezeichnung, String hersteller) {
        this.bezeichnung = bezeichnung;
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return "Computerteil " + getClass().getSimpleName() + "{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", hersteller='" + hersteller + '\'' +
                '}';
    }
}

