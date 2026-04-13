package tag01.aufgaben.lösung_4.unrefaktorisiert;

//-----------------------------------------------------------

//---------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
enum Versandoption{
	HERMES,
	DHL,
	UPS
}

//---------------------------------------------------------------------------------------------------------------------------------

public class VersandkostenBerechnung {

		public static void main(String[] args) {
			
			Adresse zielort = new Adresse("Hendrick", "Zuhause 12", "Dortmund", "12345", "GER");
			Adresse herkunftsort = new Adresse("Gabi", "Wegstraße 12", "Berlin", "54321", "GER");
			
			Bestellung bestellung = new Bestellung(zielort, herkunftsort, Versandoption.HERMES);
			
			VersandkostenBerechnungsService service = new VersandkostenBerechnungsService();
			double versandkosten = service.berechneVersandkosten(bestellung);
			System.out.println(versandkosten);
		}
}
