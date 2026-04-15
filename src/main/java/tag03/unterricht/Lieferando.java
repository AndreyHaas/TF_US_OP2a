package tag03.unterricht;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lieferando {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FabrikRestaurant restaurant = null;
        int auswahl = 0;

        System.out.println("\nWillkommen bei Lieferando :) ");

        while (auswahl != 1 || auswahl != 2) {
            System.out.println("\nWas möchtest du heute essen?");
            System.out.println("Wähle 1 für Asiatisches Restaurant");
            System.out.println("Wähle 2 für Italienisches Restaurant");

            try {
                auswahl = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Falsche Eingabe, nur Zahlen sind erlaubt.");
                auswahl = 3;
            }

            switch (auswahl) {
                case 1:
                    restaurant = new AsiatischesRestaurant();
                    System.out.println(restaurant.erzeugeGericht().liefertProduktinfos());
                    break;
                case 2:
                    restaurant = new ItalienischesRestaurant();
                    System.out.println(restaurant.erzeugeGericht().liefertProduktinfos());
                    break;
                default:
                    System.out.println("Diese Auswahl stand nicht zur Verfügung. Restaurant wird gerade gebaut.");
                    break;
            }

            System.out.println("Möchtest du noch etwas bestellen? Tippe J oder N");
            scan.nextLine(); //Tasturpuffer löschen
            String verlassen = scan.nextLine();
            if (verlassen.equalsIgnoreCase("N"))
                break;
        }

        scan.close();
        System.out.println("Vielen Dank für deine Bestellung :)");


    }
}
