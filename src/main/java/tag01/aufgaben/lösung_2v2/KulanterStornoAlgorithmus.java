package tag01.aufgaben.lösung_2v2;

public class KulanterStornoAlgorithmus implements StornoAlgorithmus {
    // Die Stornierung mit dem kulanten Algorithmus kostet 25% der Reisekosten, wenn es noch mehr als ein Tag bis zur Reise sind, sonst 50%.
    @Override
    public double berechneStorno(Reise reise) {
        if (reise.bestimmeTage() >= 1)
            return reise.berechnePreis() * 0.25;
        return reise.berechnePreis() * 0.50;
    }
}
