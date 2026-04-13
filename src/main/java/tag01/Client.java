package tag01;

import GroßKleinSchreibung.Kontext;
import GroßKleinSchreibung.StrategieGroßschreibung;
import GroßKleinSchreibung.StrategieKleinschreibung;
import GroßKleinSchreibung.StrategieNormal;

import sortierer.BubbleSort;
import sortierer.MergeSort;
import sortierer.Quicksort;
import sortierer.Sortierer;
import tag01.tiere.Hund;
import tag01.tiere.Katze;
import tag01.tiere.Maus;
import tag01.tiere.TierweltApp;

import java.util.Arrays;
import java.util.Scanner;

public class Client
{


    public static void main(String[] args)
    {
        // ********************************************************************************************************
        // **** Tierwelt ******************************************************************************************
        // ********************************************************************************************************
        System.out.println("********************************************************************************************************");
        System.out.println("**** Tierwelt ******************************************************************************************");
        System.out.println("********************************************************************************************************");

        // Vorstellung die App wird heruntergeladen oder Website namens 'GroßKleinSchreibung.Kontext' geöffnet
        TierweltApp tierweltApp = new TierweltApp();

        Hund bello = new Hund();
        Maus maus = new Maus();
        Katze katze = new Katze();

        // 1. Tier auswählen (Strategie auswählen)
        tierweltApp.setTier(bello);

        // 2. Methode ausführen
        tierweltApp.führeStrategieAus();


        // ********************************************************************************************************
        // **** GROß und Kleinschreibung *************************************************************************
        // ********************************************************************************************************
        System.out.println("\n\n********************************************************************************************************");
        System.out.println("**** GROß und Kleinschreibung **************************************************************************");
        System.out.println("********************************************************************************************************");

        // Vorstellung die App wird heruntergeladen oder Website namens 'GroßKleinSchreibung.Kontext' geöffnet
        Kontext kontext = new Kontext();

        StrategieGroßschreibung g = new StrategieGroßschreibung();
        StrategieKleinschreibung k = new StrategieKleinschreibung();
        StrategieNormal n = new StrategieNormal();

        // Client drückt auf den Button welche Stategie er auswählt
        kontext.setStrategie(n);

        // Client drückt auf ausführen
        System.out.println(kontext.führeStrategieAus("Hallo ", "Welt"));


        // Ausgabemenü für Benutzerfreundlichkeit
        // 1. User zwei Strings eintippen lassen
        // 2. User fragen ob er diese Strings groß, klein oder normal ausgegeben haben möchte (GroßKleinSchreibung.Strategie wählen)
        // 3. Ausgabe der Strings
        Scanner scan = new Scanner(System.in);
        System.out.println("Tippe einen Text ein: ");
        String string1 =scan.nextLine();
        System.out.println("Tippe noch einen Text ein: ");
        String string2 =scan.nextLine();


        //2. GroßKleinSchreibung.Strategie wählen
        System.out.println("Möchtest du die Texte in: ");
        System.out.println("1 = Großbuchstaben");
        System.out.println("2 = Kleinbuchstaben");
        System.out.println("3 = Normal");

        int auswahl = scan.nextInt();
        switch (auswahl)
        {
            case 1:
                kontext.setStrategie(new StrategieGroßschreibung());
                break;
            case 2:
                kontext.setStrategie(new StrategieKleinschreibung());
                break;
            case 3:
                kontext.setStrategie(new StrategieNormal());
                break;
        }

        // 3. GroßKleinSchreibung.Strategie wird ausgeführt
        System.out.println(kontext.führeStrategieAus(string1,string2));


        // ********************************************************************************************************
        // **** Sortierer *************************************************************************
        // ********************************************************************************************************
        System.out.println("\n\n********************************************************************************************************");
        System.out.println("**** Sortierer *****************************************************************************************");
        System.out.println("********************************************************************************************************");

        // Array muss erzeugt und befüllt werden
        // User muss Sortieralgorithmus wählen
        // sortiertes Array soll auf der Konsole ausgegeben werden

        int[] zahlenArray = {289,9,15,789,3,222 };

        System.out.println("Ausgabe unsortieres Array:");
        System.out.println(Arrays.toString(zahlenArray));

        // 1. Sortierer starten
        Sortierer sortierer = new Sortierer();

        //___________________________________________________________________

        System.out.println("\n*** BubbleSort ***");
        int[] zahlenArray2 = {289,9,15,789,3,222 };

        // 2. Algorithmus wählen
        sortierer.setAlgo(new BubbleSort());

        // 3. Methode ausführen
        sortierer.sortiere(zahlenArray2);

        System.out.println("Ausgabe sortieres Array:");
        System.out.println(Arrays.toString(zahlenArray2));

        //___________________________________________________________________

        System.out.println("\n*** MergeSort ***");
        int[] zahlenArray3 = {289,9,15,789,3,222 };
        // 2. Algorithmus wählen
        sortierer.setAlgo(new MergeSort());

        // 3. Methode ausführen
        sortierer.sortiere(zahlenArray3);

        System.out.println("Ausgabe sortieres Array:");
        System.out.println(Arrays.toString(zahlenArray3));


        //___________________________________________________________________

        System.out.println("\n*** QUICKSORT ***");
        // 2. Algorithmus wählen
        sortierer.setAlgo(new Quicksort());

        // 3. Methode ausführen
        sortierer.sortiere(zahlenArray);

        System.out.println("Ausgabe sortieres Array:");
        System.out.println(Arrays.toString(zahlenArray));








    }

}
