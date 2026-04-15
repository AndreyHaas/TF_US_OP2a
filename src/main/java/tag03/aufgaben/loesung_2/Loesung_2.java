package tag03.aufgaben.loesung_2;

import java.util.Scanner;

public class Loesung_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welches Produkt (electronics/book/clothing): ");
        String productType = scanner.nextLine();

        Product product = ProductFactory.createProduct(productType);
        product.displayInfo();
    }
}