package tag01.aufgaben.lösung_4.unrefaktorisiert;

public class Bestellung {

    private Versandoption versender;
    private Adresse zielort;
    private Adresse herkunft;

    Bestellung(Adresse zielort, Adresse herkunft, Versandoption versender) {
        this.zielort = zielort;
        this.herkunft = herkunft;
        this.versender = versender;
    }

    public Versandoption getVersendeMethode() {
        return versender;
    }

    public void setVersendeMethode(Versandoption versender) {
        this.versender = versender;
    }

    public Adresse getZielort() {
        return zielort;
    }

    public void setZielort(Adresse zielort) {
        this.zielort = zielort;
    }

    public Adresse getHerkunft() {
        return herkunft;
    }

    public void setHerkunft(Adresse herkunft) {
        this.herkunft = herkunft;
    }
}
