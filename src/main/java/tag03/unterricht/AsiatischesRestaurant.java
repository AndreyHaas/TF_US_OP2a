package tag03.unterricht;

import java.util.Scanner;

public class AsiatischesRestaurant extends FabrikRestaurant {
    GebrateneNudeln gebrateneNudeln;
    Scanner scan = new Scanner(System.in);

    @Override
    public ProduktGericht erzeugeGericht() {
        System.out.println("Wie möchtest du deine gebratenen Nudeln? Tippe ein: 'vegetarisch' oder 'mit Ente'");
        String variante = scan.nextLine();

        if (variante.toLowerCase().startsWith("veg")) {
            gebrateneNudeln = new GebrateneNudeln(12.99, "vegetarisch");
        } else if (variante.toLowerCase().contains("ente")) {
            gebrateneNudeln = new GebrateneNudeln(15.99, "mit Ente");
        } else {
            System.out.println("Deine Wunschvariante der gebratenen Nudeln bieten wir nicht an. Bestelle neu!");
            gebrateneNudeln = null;
        }

        return gebrateneNudeln;
    }

    @Override
    public String bestellungsInfo() {
        return gebrateneNudeln.liefertProduktinfos();
    }
}