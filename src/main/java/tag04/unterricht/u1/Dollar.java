package tag04.unterricht.u1;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class Dollar {
  public BigDecimal betrag;

  public BigDecimal getBetrag() {
    return betrag;
  }

  public void setBetrag(BigDecimal betrag) {
    this.betrag = betrag;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Dollar.class.getSimpleName() + "[", "]")
        .add("betrag=" + betrag)
        .toString();
  }
}
