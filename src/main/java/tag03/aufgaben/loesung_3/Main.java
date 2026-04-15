package tag03.aufgaben.loesung_3;

/* Abstrakte Klasse 'Computerfabrik' mit abstrakter Methode 'erstelleComputerTeil', der Art als String-Parameter und dem Computerteil als Rückgabe. Davon erben MSIFabrik und GigabyteFabrik.
 *
 * Abstrakte Klasse 'Computerteil' mit Bezeichnung und Hersteller, einem Konstruktor und toString()-Methode. Davon erben 'Grafikkarte', 'Mainboard' und 'SSD'.
 *
 * Die Fabrik erzeugt Objekte entsprechend der übergebenen Art. Die Art kann dabei als Bezeichnung übernommen werden, Hersteller passend zur Fabrik.
 *
 */

public class Main {
    public static void main(String[] args) {
        Computerfabrik MSI = new MSIFabrik();
        Computerfabrik Gigabyte = new GigabyteFabrik();

        Computerteil mainboard = MSI.erstelleComputerTeil("Mainboard");
        System.out.println(mainboard);
        mainboard.setBezeichnung("MSI B450");
        System.out.println(mainboard.getBezeichnung());

        Computerteil grafikkarte = Gigabyte.erstelleComputerTeil("Grafikkarte");
        System.out.println(grafikkarte);
        grafikkarte.setBezeichnung("Gigabyte GTX 1080 Ti");
        System.out.println(grafikkarte.getBezeichnung());
    }
}
