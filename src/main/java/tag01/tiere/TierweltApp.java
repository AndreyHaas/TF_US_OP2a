package tag01.tiere;


public class TierweltApp {

    //Attribut von dem Interface Tier
    private Tier t;

    // Setter-Methode um Tier zu setzen
    public void setTier(Tier t) {
        this.t = t;
    }

    // Methode um Methode 'macheGeräusch' auszuführen
    public void führeStrategieAus() {
        t.macheGeräusch();
    }
}