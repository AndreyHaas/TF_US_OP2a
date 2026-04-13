package tag01.aufgaben.lösung_2;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Reise {
    protected double grundPreis;
    private final LocalDateTime reiseBeginn;
    protected StornoAlgorithmus stornoAlgorithmus;

    protected Reise(LocalDateTime reiseBeginn, double grundPreis) {
        this.reiseBeginn = reiseBeginn;
        this.grundPreis = grundPreis;
    }

    /**
     * Ermittelt die Anzahl Tage bis zum Reisebeginn.
     */
    public int bestimmeTage() {
        return (int) Duration.between(LocalDateTime.now(), reiseBeginn).toDays();
    }

    /**
     * Kalkuliert mit unterschiedlichen Algorithmen den Preis der Reise.
     */
    public abstract double berechnePreis();

    /**
     * Setzt den Storno Algorithmus.
     */
    public void setStornoAlgorithmus(StornoAlgorithmus stornoAlgorithmus) {
        this.stornoAlgorithmus = stornoAlgorithmus;
    }

    /**
     * Berechnet die Stornogebühren und gibt diese zurück.
     */
    public double berechneStorno() {
        return stornoAlgorithmus.berechneStorno(this);
    }
}