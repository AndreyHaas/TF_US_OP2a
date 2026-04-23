package tag04.unterricht.u1.mitDozentGeloest;

public class Client {

  public static void main(String[] args) {
    // Aufgabenstellung: Kund emöchte einkaufen gehen, aber hat nur Euro
    // Euro-Objekt erzeugen
    Euro euro = new Euro();
    euro.betrag = 100;

    ClientInterface amiShop = new AdapterEuroDollar(new AmerikanischerOnlineShop());

    // Aufrufen der Methode einkaufen
    Euro restGeld = amiShop.tätigeKauf(euro);
    System.out.printf("Du hast nach dem ersten Einkauf noch %.2f Euro\n\n", restGeld.betrag);

    // Aufrufen der Methode einkaufen
    restGeld = amiShop.tätigeKauf(restGeld);
    System.out.printf("Du hast nach dem zweiten Einkauf noch %.2f Euro\n\n", restGeld.betrag);

    // Aufrufen der Methode einkaufen
    restGeld = amiShop.tätigeKauf(restGeld);
    System.out.printf("Du hast nach dem dritten Einkauf noch %.2f Euro\n\n", restGeld.betrag);
  }
}