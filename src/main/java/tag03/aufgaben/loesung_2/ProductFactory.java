package tag03.aufgaben.loesung_2;

public class ProductFactory {

    public static Product createProduct(String type) throws IllegalArgumentException {
        if (type.equalsIgnoreCase("electronics")) {
            return new Electronics();
        } else if (type.equalsIgnoreCase("book")) {
            return new Book();
        } else if (type.equalsIgnoreCase("clothing")) {
            return new Clothing();
        }

        throw new IllegalArgumentException("Ungültiger Produkt-Typ: " + type);
    }
}