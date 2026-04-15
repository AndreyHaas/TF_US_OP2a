package tag03.aufgaben.loesung_3;

public class GigabyteFabrik extends Computerfabrik {
    @Override
    public Computerteil erstelleComputerTeil(String art) {
        return switch (art) {
            case "Mainboard" -> new Mainboard(art, "Gigabyte");
            case "SSD" -> new SSD(art, "Gigabyte");
            case "Grafikkarte" -> new Grafikkarte(art, "Gigabyte");
            default -> null;
        };
    }
}