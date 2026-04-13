package tag01.aufgaben.lösung_2v2;

import java.time.LocalDate;

public class Lösung_2 {
    public static void main(String[] args) {
        Reise reise = new GoldReise(100, LocalDate.now().plusDays(1));
        //reise.setStornoAlgorithmus(new KulanterStornoAlgorithmus());
        reise.setStornoAlgorithmus(new StrengerStornoAlgorithmus());
        System.out.println(reise.bestimmeTage());
        System.out.println(reise.berechnePreis());
        System.out.println(reise.berechneStorno());
    }
}