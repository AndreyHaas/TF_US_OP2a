package tag04.unterricht.u1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AdapterEuroDollar implements IClient {

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

  private final AmerikanischeOnlineShop onlineAmerikanischeShop;

  private final BigDecimal wechselKurse = BigDecimal.valueOf(1.18);

  @Override
  public Euro taetigeKauf(Euro euro) {
    return wechselDollarInEuro(onlineAmerikanischeShop.shopping(wechselEuroInDollar(euro)));
  }

  private Dollar wechselEuroInDollar(Euro euro) {
    Dollar dollar = new Dollar();
    dollar.setBetrag(euro.getBetrag().multiply(wechselKurse));
    return dollar;
  }

  private Euro wechselDollarInEuro(Dollar dollar) {
    Euro euro = new Euro();
    BigDecimal betragInDollar = dollar.getBetrag();
    euro.setBetrag(betragInDollar.divide(wechselKurse, 2, RoundingMode.HALF_UP));
    return euro;
  }

  public AdapterEuroDollar(AmerikanischeOnlineShop onlineAmerikanischeShop) {
    this.onlineAmerikanischeShop = onlineAmerikanischeShop;
  }
}
