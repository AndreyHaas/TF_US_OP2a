package tag01.aufgaben.lösung_2v2;

public class StrengerStornoAlgorithmus implements StornoAlgorithmus {
    // Eine Stornierung der Reise mit dem strengen Algorithmus kostet 25% der Reisekosten, wenn die Tage bis zur Abreise > 10 sind, sonst 75%.
    @Override
    public double berechneStorno(Reise reise) {
        if (reise.bestimmeTage() > 10)
            return reise.berechnePreis() * 0.25;
        return reise.berechnePreis() * 0.75;
    }
}
