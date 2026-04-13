package tag01.aufgaben.lösung_4.strategie;


public class Bestellung {
    private VersandkostenStrategie versandkostenStrategie;
    private Adresse zielort;
    private Adresse herkunft;

    public Bestellung(VersandkostenStrategie versandkostenStrategie, Adresse zielort, Adresse herkunft) {
        this.versandkostenStrategie = versandkostenStrategie;
        this.zielort = zielort;
        this.herkunft = herkunft;
    }

    public VersandkostenStrategie getVersandkostenStrategie() {
        return versandkostenStrategie;
    }

    public void setVersandkostenStrategie(VersandkostenStrategie versandkostenStrategie) {
        this.versandkostenStrategie = versandkostenStrategie;
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