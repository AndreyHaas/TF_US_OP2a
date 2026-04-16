package tag04.unterricht.u1;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class Euro {
  private BigDecimal betrag;

  public void setBetrag(BigDecimal betrag) {
    this.betrag = betrag;
  }

  public BigDecimal getBetrag() {
    return betrag;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Euro.class.getSimpleName() + "[", "]")
        .add("betrag=" + betrag)
        .toString();
  }
}
