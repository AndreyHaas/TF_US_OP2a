package tag01.aufgaben.lösung_2;

import java.time.LocalDateTime;

public class BronzeReise extends Reise {
    // Bei BronzeReisen kommt der strenge Stornoalgorithmus zum Einsatz (bei Stammkunden kann der Algorithmus auf den kulanten Stornoalgorithmus gesetzt werden)
    public BronzeReise(LocalDateTime reiseBeginn, double grundPreis) {
        super(reiseBeginn, grundPreis);
        this.stornoAlgorithmus = new StrengerStornoAlgorithmus();
    }

    @Override
    public double berechnePreis() {
        return grundPreis * 1.25;
    }
}
