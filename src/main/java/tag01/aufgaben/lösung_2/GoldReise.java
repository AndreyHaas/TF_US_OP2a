package tag01.aufgaben.lösung_2;

import java.time.LocalDateTime;

public class GoldReise extends Reise {
    // Bei GoldReisen kommt der kulante Stornoalgorithmus zum Einsatz
    public GoldReise(LocalDateTime reiseBeginn, double grundPreis) {
        super(reiseBeginn, grundPreis);
        this.stornoAlgorithmus = new KulanterStornoAlgorithmus();
    }

    @Override
    public double berechnePreis() {
        return grundPreis * 1.75;
    }
}
