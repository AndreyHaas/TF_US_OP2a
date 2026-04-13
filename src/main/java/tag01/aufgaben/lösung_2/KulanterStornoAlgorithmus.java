package tag01.aufgaben.lösung_2;

import java.util.Optional;

public class KulanterStornoAlgorithmus implements StornoAlgorithmus {
    public double berechneStorno(Reise reise) {
        return Optional.ofNullable(reise)
                .map(this::calculateStornoForReise)
                .orElseThrow(() -> new IllegalArgumentException("Reise darf nicht null sein"));
    }

    private double calculateStornoForReise(Reise reise) {
        if (reise.bestimmeTage() > 1) {
            return reise.berechnePreis() * 0.25;
        } else {
            return reise.berechnePreis() * 0.5;
        }
    }
}