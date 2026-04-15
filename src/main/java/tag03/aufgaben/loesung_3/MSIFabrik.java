package tag03.aufgaben.loesung_3;

public class MSIFabrik extends Computerfabrik {
    @Override
    public Computerteil erstelleComputerTeil(String art) {
        return switch (art) {
            case "Mainboard" -> new Mainboard(art, "MSI");
            case "SSD" -> new SSD(art, "MSI");
            case "Grafikkarte" -> new Grafikkarte(art, "MSI");
            default -> null;
        };
    }
}
