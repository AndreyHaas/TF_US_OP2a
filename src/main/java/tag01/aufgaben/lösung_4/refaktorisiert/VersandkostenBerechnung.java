package tag01.aufgaben.lösung_4.refaktorisiert;

//---------------------------------------------------------------------------------------------------
// Wir simulieren eine einfache Kostenberechnungsanwendung. Die entstehenden Kosten werden auf Basis des
// verwendeten Versandanbieters berechnet: Hermes, DHL, UPS. 
// Auf den ersten Blick sieht diese Klasse ganz normal aus. Wir prüfen den Typ der Versendemethode in einer Enumeration
// und rufen dann eine Methode auf, um die Kosten entsprechend zu berechnen. 
// Probleme gibt es dann wenn wir die Klasse ändern wollen und z.B. einen neuen Versandanbieter hinzufügen wollen. 
// Wir müssen manuell die switch Anweisung anpassen und andere Aenderungen vornehmen. Auch wenn wir den Berechnungsalgorithmus
// für die verschiedenen Versender anpassen wollen, dann müssen wir die entsprechenden Methoden erst finden und umständlich anpassen.
// Das alles bricht das Open-Closed Prinzip von SOLID. Eine Klasse soll offen für Erweiterungen sein, aber geschlossen für Veränderungen.
// Wenn Aenderungen in einem Teil des Quellcodes Aenderungen in anderen Klassen notwendig machen, dann spricht dies für schlechtes
// Softwaredesign. Wir wollen diese Klasse mit Hilfe des Strategiemusters refaktorisieren.
class VersandkostenBerechnungsService {

    public double berechneVersandkosten(Bestellung bestellung) {

        double result = -1.00d;
        switch (bestellung.getVersendeMethode()) {
            case DHL:
                result = berechneFuerDHL(bestellung);
                break;
            case HERMES:
                result = berechneFuerHermes(bestellung);
                break;
            case UPS:
                result = berechneFuerUPS(bestellung);
                break;
        }
        return result;
    }

    private double berechneFuerUPS(Bestellung bestellung) {
        return 4.00d;
    }

    private double berechneFuerHermes(Bestellung bestellung) {
        return 2.95d;
    }

    private double berechneFuerDHL(Bestellung bestellung) {
        return 3.50d;
    }

    // Das Strategie Muster ist eins der einfachsten Muster zu implementieren.
    // Wenn wir in einer Klasse viele if-else Verzweigungen haben, wo man Bedingungen prüft
    // und entsprechende Methoden aufruft, dann wird die Klasse schnell groß, es entsteht Spaghetti
    // Code und alles wird unübersichtlich. Die Software ist dann schwer zu warten, zu ändern und zu erweitern.
    // D verletzt gute OOP Design Prinzipien wie SOLID Prinzipien.

    // Das Strategiemuster kann dann Abhilfe schaffen, indem wir die verschiedenen if Anweisungen in Strategieobjekte ändern.
    // All diese Objekte implementieren dasselbe Interface und andere Objekte die eine Abhängigkeit zu dem Interface haben können
    // die Strategien verwenden ohne zu wissen welche Strategie nun eingesetzt wird.
//	public static void main(String[] args) {
//		
//		Adresse zielort = new Adresse("Hendrick", "Zuhause 12", "Dortmund", "12345", "GER");
//		Adresse herkunftsort = new Adresse("Gabi", "Wegstraße 12", "Berlin", "54321", "GER");
//		
//		Bestellung bestellung = new Bestellung(zielort, herkunftsort, Versandoptionen.UPS);
//		VersandkostenBerechnungsService service = new VersandkostenBerechnungsService();
//		
//		double versandkosten = service.berechneVersandkosten(bestellung);
//		System.out.println(versandkosten);
//		
//		//-------------------------Das System refaktorisiert mit dem Strategieentwurfsmuster.--------------------------------------
//		VersandkostenBerechnungsService serviceStrategie = new VersandkostenBerechnungsService();
//		versandkosten = service.berechneVersandkosten(bestellung);
//		System.out.println(versandkosten);
//	}
}

//---------------------------------------------------------------------------------------------------------------------------------
enum Versandoption {
    HERMES,
    DHL,
    UPS
}

//----------------------------------------------------Strategieklassen-----------------------------------------------------------------------------
interface VersandStrategieL {
    double berechneVersandkosten(Bestellung bestellung);
}

//-----------------------------------------------------------------------------------------------------------------------

public class VersandkostenBerechnung {
    // Das Strategie Muster ist eins der einfachsten Muster zu implementieren.
    // Wenn wir in einer Klasse viele if-else Verzweigungen haben, wo man Bedingungen prüft
    // und entsprechende Methoden aufruft, dann wird die Klasse schnell groß, es entsteht Spaghetti
    // Code und alles wird unübersichtlich. Die Software ist dann schwer zu warten, zu ändern und zu erweitern.
    // D verletzt gute OOP Design Prinzipien wie SOLID Prinzipien.

    // Das Strategiemuster kann dann Abhilfe schaffen, indem wir die verschiedenen if Anweisungen in Strategieobjekte ändern.
    // All diese Objekte implementieren dasselbe Interface und andere Objekte, die eine Abhängigkeit zu dem Interface haben können
    // die Strategien verwenden, ohne zu wissen welche konkrete Strategie nun eingesetzt wird.
    public static void main(String[] args) {

        Adresse zielort = new Adresse("Hendrick", "Zuhause 12", "Dortmund", "12345", "GER");
        Adresse herkunftsort = new Adresse("Gabi", "Wegstraße 12", "Berlin", "54321", "GER");

        Bestellung bestellung = new Bestellung(zielort, herkunftsort, Versandoption.HERMES);

        VersandkostenBerechnungsService service = new VersandkostenBerechnungsService();
        double versandkosten = service.berechneVersandkosten(bestellung);
        System.out.println(versandkosten);

        //-------------------------Das System refaktorisiert mit dem Strategieentwurfsmuster.--------------------------------------

        VersandkostenBerechnungsServiceL serviceStrategie = new VersandkostenBerechnungsServiceL();
        serviceStrategie.setVersandkostenBerechnungMitStrategie(new UPSVersandstrategieL());
        versandkosten = serviceStrategie.berechneVersandkosten(bestellung);
        System.out.println(versandkosten);
    }
}
