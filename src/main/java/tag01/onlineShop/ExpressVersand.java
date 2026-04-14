package tag01.onlineSchop;

public class ExpressVersand implements Versand {

  @Override
  public double berechne(Warenkorb warenkorb) {
    return warenkorb.berechneBestellWert() >= 100 ? 10 : 15;
  }
}