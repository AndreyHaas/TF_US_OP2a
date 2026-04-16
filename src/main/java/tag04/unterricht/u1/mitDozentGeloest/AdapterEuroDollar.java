public class AdapterEuroDollar implements ClientInterface
{
    /*
    1. Voraussetzung: Wir haben mindestens zwei Klassen mit nicht kompatiblen Interfaces.
    2. Erstelle das Interface für den Client mit den Methoden zur Kommunikation mit der Serviceklasse.
    3. Referenziere den Service in einer neuen Adapterklasse.
    4. Implementiere das Interface in die Adapterklasse und implementiere die Logik um den Service verwenden zu können.
     */

    /*
         Ein Adapter benötigt:
         - Funktion um Euro in Dollar umzurechnen (Euro * Wechselkurs = Dollar)
         - Verbindung zum ClientInterface(Euro) um zu AmerikanischenOnlineShop(Dollar)
         - Funktion um Dollar in Euro umzurechnen (Dollar * Wechselkurs = Euro)
     */

    private AmerikanischerOnlineShop amiShop;

    // Konstruktor soll direkt als Parameter einen Amerikanischen OnlineShop bekommen
    public AdapterEuroDollar(AmerikanischerOnlineShop amiShop)
    {
        this.amiShop = amiShop;
    }


    // Methode 1: Euro in Dollar
    private Dollar wechsleEuroInDollar(Euro e)
    {
        Dollar d = new Dollar();
               d.betrag = e.betrag * 1.18;
        return d;
    }

    // Methode 2: Dollar in Euro
    private Euro wechsleDollarInEuro(Dollar d)
    {
        Euro e = new Euro();
             e.betrag = d.betrag / 1.18;
        return e;
    }


    // Methode 3: Service nutzen, in diesem Fall shopping
    @Override
    public Euro tätigeKauf(Euro e)   //100 Euro
    {
        //1. Euro in Dollar wechseln
        Dollar dollar = wechsleEuroInDollar(e); //118 Dollar

        //2. mit Dollar shoppen gehen
        Dollar rückgeld = amiShop.shopping(dollar); //118 Dollar -10 Dollar =108 Dollar -> 88,56 Euro

        //3. Rückgeld muss von Dollar in Euro gewechselt werden
        return wechsleDollarInEuro(rückgeld); //108 Dollar -> 88,56 Euro

    }
}
