package tag02.hausAufgaben.a3;

import java.util.StringJoiner;

public class Kunde {

  private final String name;
  private final int kundennummer;
  private final String telefonnummer;

  public Kunde(String name, int kundennummer, String telefonnummer) {
    this.name = name;
    this.kundennummer = kundennummer;
    this.telefonnummer = telefonnummer;
  }

  // Getter (fuer SMS-Versand)
  public String getName() {
    return name;
  }

  public int getKundennummer() {
    return kundennummer;
  }

  public String getTelefonnummer() {
    return telefonnummer;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", getClass().getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("kundennummer=" + kundennummer)
        .add("telefonnummer='" + telefonnummer + "'")
        .toString();
  }
}