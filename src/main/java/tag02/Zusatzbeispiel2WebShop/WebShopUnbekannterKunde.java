package tag02.Zusatzbeispiel2WebShop;

import java.util.ArrayList;

public class WebShopUnbekannterKunde implements Beobachter {

  private String name;
  private boolean istWeiblich;

  public WebShopUnbekannterKunde(String nachname, boolean istWeiblich) {
    this.name = nachname;
    this.istWeiblich = istWeiblich;
  }

  public void update(ArrayList<String> produktliste) {
    if (istWeiblich == true) {
      System.out.println("Sehr geehrte Frau " + name + " anbei der neue Produktkatalog:");
    } else {
      System.out.println("Sehr geehrter Herr " + name + " anbei der neue Produktkatalog:");
    }

    for (String s : produktliste) {
      System.out.println("\t-" + s);
    }
  }
}
