package tag01.aufgaben.lösung_3;

public class Standard implements Versand {
    public double berechnen(Warenkorb warenkorb) {
        double summe = warenkorb.getGesamtwert();
        if (summe < 100) {
            return 10;
        } else {
            return 5;
        }
    }
}
