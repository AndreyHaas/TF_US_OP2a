package tag03.unterricht;

import java.util.Scanner;

public class ItalienischesRestaurant extends FabrikRestaurant {
    Pizza pizza;
    Scanner scan = new Scanner(System.in);

    @Override
    public ProduktGericht erzeugeGericht() {
        System.out.println("Wie groß soll die Pizza sein? Wähle 30 cm oder 20 cm.");
        int groeße = scan.nextInt();
        scan.nextLine(); // Tastaturpuffer löschen für die nächste Eingabe

        System.out.println("Möchtest du Salami, Schinken oder Funghi?");
        String sorte = scan.nextLine();

        if (groeße == 20) {
            pizza = new Pizza(20, 12.99, sorte);
        } else if (groeße == 30) {
            pizza = new Pizza(30, 17.99, sorte);
        } else {
            pizza = null;
            System.out.println("Pizza in deiner Wunschgröße bieten wir leider nicht an. Bestelle neu!");
        }

        return pizza;
    }

    @Override
    public String bestellungsInfo() {
        return pizza.liefertProduktinfos();
    }
}
