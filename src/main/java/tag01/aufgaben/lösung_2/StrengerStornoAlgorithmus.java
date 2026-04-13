package tag01.aufgaben.lösung_2;

public class StrengerStornoAlgorithmus implements StornoAlgorithmus {
    public double berechneStorno(Reise reise) {
        return reise.bestimmeTage() > 10 ? reise.berechnePreis() * 0.25 : reise.berechnePreis() * 0.75;
    }
}
