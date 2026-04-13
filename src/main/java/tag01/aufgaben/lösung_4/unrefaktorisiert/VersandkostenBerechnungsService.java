package tag01.aufgaben.lösung_4.unrefaktorisiert;

// Wir simulieren eine einfache Kostenberechnungsanwendung. Die entstehenden Kosten werden auf Basis des
// verwendeten Versandanbieters berechnet: Hermes, DHL, UPS. 
// Auf den ersten Blick sieht diese Klasse ganz normal aus. Wir prüfen den Typ der Versendemethode in einer Enumeration
// und rufen dann eine Methode auf, um die Kosten entsprechend zu berechnen. 
// Was könnten die Probleme sein?
public class VersandkostenBerechnungsService {

	public double berechneVersandkosten(Bestellung bestellung) {
		return switch (bestellung.getVersendeMethode()) {
            case DHL -> berechneFuerDHL(bestellung);
            case HERMES -> berechneFuerHermes(bestellung);
            case UPS -> berechneFuerUPS(bestellung);
        };
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
}
