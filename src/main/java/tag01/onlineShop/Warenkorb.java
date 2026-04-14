package tag01.onlineSchop;

import java.util.HashMap;
import java.util.Map;

public class Warenkorb {

  private Versand versand;

  private Map<String, Double> artikel;

  public Warenkorb() {
    this.artikel = new HashMap<>();
  }

  public Map<String, Double> getArtikel() {
    return new HashMap<>(artikel);
  }

  public Versand getVersand() {
    return versand;
  }

  public void setVersand(Versand versand) {
    this.versand = versand;
  }

  public void setArtikel(Map<String, Double> artikel) {
    this.artikel = new HashMap<>(artikel);
  }

  public void removeArtikel(String name) {
    artikel.remove(name);
  }

  public void fuegeArtikelHinzu(String name, double preis) {
    artikel.put(name, preis);
  }

  public double berechneBestellWert() {
    return artikel
        .values()
        .stream()
        .mapToDouble(Double::doubleValue)
        .sum();
  }

  public double berechneVersandkosten() {
    return versand.berechne(this);
  }
}