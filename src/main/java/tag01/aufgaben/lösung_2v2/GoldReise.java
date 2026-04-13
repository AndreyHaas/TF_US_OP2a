package tag01.aufgaben.lösung_2v2;

import java.time.LocalDate;

public class GoldReise extends Reise {
    public GoldReise(double grundpreis, LocalDate reisebeginn) {
        super(grundpreis, reisebeginn);
        setStornoAlgorithmus(new KulanterStornoAlgorithmus());
    }

    @Override
    public double berechnePreis() {
        return grundpreis * 1.75;
    }
}
