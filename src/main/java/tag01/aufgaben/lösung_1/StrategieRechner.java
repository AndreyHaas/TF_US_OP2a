package tag01.aufgaben.lösung_1;

import java.util.Scanner;


//--------------------------------------------------------------------------------------------------------------------

public class StrategieRechner {

    public static void main(String[] args) {

        Kontext kontext = new Kontext();

        System.out.println("Bitte wählen Sie eine mathematische Operation: (a - Addition / s - Subtraktion / m - Multiplikation / d - Division)");

        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);

        switch (Character.toLowerCase(input)) {
            case 'a':
                kontext.setStrategie(new KonkreteStrategieAddition());
                break;
            case 's':
                kontext.setStrategie(new KonkreteStrategieSubtraktion());
                break;
            case 'm':
                kontext.setStrategie(new KonkreteStrategieMultiplikation());
                break;
            case 'd':
                kontext.setStrategie(new KonkreteStrategieDivision());
                break;
            default:
                throw new IllegalArgumentException();
        }

        int zahl1;
        int zahl2;
        scanner.nextLine();
        System.out.println("Bitte geben Sie die erste Zahl ein: ");
        String inputs = scanner.nextLine();
        zahl1 = Integer.parseInt(inputs);

        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        inputs = scanner.nextLine();
        zahl2 = Integer.parseInt(inputs);

        System.out.println("Das Ergebnis ist: " + kontext.fuehreStrategieAus(zahl1, zahl2));
    }
}