package tag03.aufgaben.loesung_1;

public class MarsFabrik extends Fabrik {
    @Override
    public Pizza erstellePizza(String sorte) {
        switch (sorte) {
            case "Salami":
                return new MarsSalamiPizza();
            case "Schinken":
                return new MarsSchinkenPizza();
            default:
                return null;
        }
    }
}
