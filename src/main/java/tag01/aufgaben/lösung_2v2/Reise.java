package tag01.aufgaben.lösung_2v2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Reise {
    protected double grundpreis;
    private LocalDate reisebeginn;
    private StornoAlgorithmus stornoAlgorithmus;

    public int bestimmeTage() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), reisebeginn);
    }

    public abstract double berechnePreis();

    public double getGrundpreis() {
        return grundpreis;
    }

    public void setGrundpreis(double grundpreis) {
        this.grundpreis = grundpreis;
    }

    public LocalDate getReisebeginn() {
        return reisebeginn;
    }

    public void setReisebeginn(LocalDate reisebeginn) {
        this.reisebeginn = reisebeginn;
    }

    public StornoAlgorithmus getStornoAlgorithmus() {
        return stornoAlgorithmus;
    }

    public void setStornoAlgorithmus(StornoAlgorithmus stornoAlgorithmus) {
        this.stornoAlgorithmus = stornoAlgorithmus;
    }

    public double berechneStorno() {
        return stornoAlgorithmus.berechneStorno(this);
    }

    public Reise(double grundpreis, LocalDate reisebeginn) {
        this.grundpreis = grundpreis;
        this.reisebeginn = reisebeginn;
    }
}

