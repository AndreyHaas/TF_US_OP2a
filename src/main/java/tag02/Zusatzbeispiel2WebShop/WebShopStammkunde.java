package tag02.Zusatzbeispiel2WebShop;

import java.util.ArrayList;

public class WebShopStammkunde implements Beobachter {

  private String name;
  private boolean isWeiblich;

  public WebShopStammkunde(String name, boolean isWeiblich) {
    this.name = name;
    this.isWeiblich = isWeiblich;
  }

  @Override
  public void update(ArrayList<String> produktliste) {
    if (isWeiblich == true) {
      System.out.println("Liebe " + name + " hier der neue Produktkatalog:");
    } else {
      System.out.println("Lieber " + name + " hier der neue Produktkatalog:");
    }
    for (String s : produktliste) {
      System.out.println("\t-" + s);
    }
  }
}