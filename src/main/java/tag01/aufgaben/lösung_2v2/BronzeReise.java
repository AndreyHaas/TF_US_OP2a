package tag01.aufgaben.lösung_2v2;

import java.time.LocalDate;

public class BronzeReise extends Reise {
    public BronzeReise(double grundpreis, LocalDate reisebeginn) {
        super(grundpreis, reisebeginn);
        StornoAlgorithmus s = new StrengerStornoAlgorithmus();
        setStornoAlgorithmus(s);
    }

    @Override
    public double berechnePreis() {
        //Die Bronze-Reise kostet Grundpreis * 1.25, die Gold-Reise kostet Grundpreis * 1.75
        return grundpreis * 1.25;
    }
}
