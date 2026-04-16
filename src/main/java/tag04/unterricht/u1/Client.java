package tag04.unterricht.u1;

import java.math.BigDecimal;

public class Client {

  public static void main(String[] args) {
    Euro euro = new Euro();
    euro.setBetrag(BigDecimal.valueOf(100));
    IClient shop = new AdapterEuroDollar(new AmerikanischeOnlineShop());

    euro = shop.taetigeKauf(euro);
    System.out.println(euro);

    euro = shop.taetigeKauf(euro);
    System.out.println(euro);
  }
}
