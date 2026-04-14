package tag01.onlineSchop;

public class StandartVersand implements Versand {

  @Override
  public double berechne(Warenkorb warenkorb) {
    return warenkorb.berechneBestellWert() >= 100 ? 5 : 10;
  }
}
