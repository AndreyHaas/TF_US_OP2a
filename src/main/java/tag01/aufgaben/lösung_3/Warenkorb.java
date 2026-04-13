package tag01.aufgaben.lösung_3;

import java.util.HashMap;
import java.util.Map;

public class Warenkorb {
    private final Map<Artikel, Integer> artikelMap = new HashMap<>();

    private Versand versand;

    public Warenkorb() {
        versand = new Standard();
    }

    public void addArtikel(Artikel artikel, int anzahl) {
        if (this.artikelMap.containsKey(artikel))
            artikelMap.replace(artikel, artikelMap.get(artikel) + anzahl);
        else
            this.artikelMap.put(artikel, anzahl);
    }

    public double getGesamtwert() {
        double summe = 0;

        for (Map.Entry<Artikel, Integer> entry : artikelMap.entrySet())
            summe += entry.getKey().getPreis() * entry.getValue();

        // Alternative:
        /*for (Artikel a : artikelMap.keySet())
            summe += a.getPreis() * artikelMap.get(a);*/

        return summe;
    }

    public void setVersand(Versand versand) {
        this.versand = versand;
    }

    public double getVersandkosten() {
        return versand.berechnen(this);
    }
}
