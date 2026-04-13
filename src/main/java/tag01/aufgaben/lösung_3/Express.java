package tag01.aufgaben.lösung_3;

public class Express implements Versand {
    public double berechnen(Warenkorb warenkorb) {
        return warenkorb.getGesamtwert() < 100 ? 15 : 10;
    }
}
