package tag03.aufgaben.loesung_1;

public class VenusFabrik extends Fabrik {
    @Override
    public Pizza erstellePizza(String sorte) {
        return switch (sorte) {
            case "Salami" -> new VenusSalamiPizza();
            case "Schinken" -> new VenusSchinkenPizza();
            default -> null;
        };
    }
}
