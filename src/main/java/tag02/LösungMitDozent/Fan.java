package tag02.LösungMitDozent;

import tag02.LösungMitDozent.Beobachter;

public class Fan implements Beobachter {
  // Alle konkreten Beobachter Klassen implementieren das Interface und überschreiben
  // jeweils die abstrakte update() Methode auf ihre eigene Weise.

  private String name;
  private String telefonnummer;
  private boolean sprichtDeutsch;

  public Fan(String name, String telefonnummer, boolean sprichtDeutsch) {
    this.name = name;
    this.telefonnummer = telefonnummer;
    this.sprichtDeutsch = sprichtDeutsch;
  }

  @Override
  public void update(String s) {
    if (sprichtDeutsch == true) {
      System.out.println("*** Whatsappserver wird aufgerufen ***");
      System.out.println("Server eine Nachricht an " + telefonnummer);
      System.out.println("Hallo " + name + ", hier die neusten Infos zum Spiel: " + s + "\n");
    } else {
      System.out.println("*** Whatsappserver was enabled ***");
      System.out.println("Server send a message to " + telefonnummer);
      System.out.println("Hi dear " + name + ", here the news: " + s + "\n");
    }

  }


}
