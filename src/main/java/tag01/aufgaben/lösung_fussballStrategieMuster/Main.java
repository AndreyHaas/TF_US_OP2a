package tag01.aufgaben.lösung_fussballStrategieMuster;

public class Main {
    public static void main(String[] args) {
        Mannschaft fcBarcelona = new Mannschaft(new OffensiveStrategie(), "FC Barcelona");
        Mannschaft werderBremen = new Mannschaft(new DefensiveStrategie(), "Werder Bremen");
        System.out.println("Anpfiff! - Das Spiel geht los! :D");
        System.out.println(fcBarcelona.getMannschaftsname() + ": ");
        fcBarcelona.fuehreStrategieAus();
        System.out.println(werderBremen.getMannschaftsname() + ": ");
        werderBremen.fuehreStrategieAus();
    }
}