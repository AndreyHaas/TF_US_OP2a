package tag04.unterricht.u1;

import java.math.BigDecimal;

public class AmerikanischeOnlineShop {

  public Dollar shopping(Dollar dollar) {
    System.out.println("Thank you for Shopping");
    BigDecimal dollarBetrag = dollar.getBetrag();
    dollar.setBetrag(dollarBetrag.subtract(BigDecimal.TEN));
    return dollar;
  }
}
