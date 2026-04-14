package tag02.Zusatzbeispiel2WebShop;

public class Client {

  public static void main(String[] args) {
    Webshop edeka = new Webshop();

    WebShopStammkunde s1 = new WebShopStammkunde("Ursula", true);
    WebShopStammkunde s2 = new WebShopStammkunde("Jens", false);
    WebShopUnbekannterKunde herrMueller = new WebShopUnbekannterKunde("Müller", false);
    WebShopUnbekannterKunde frauSchmid = new WebShopUnbekannterKunde("Schmid", true);

    edeka.abonnentenHinzufuegen(s1);
    edeka.abonnentenHinzufuegen(s2);
    edeka.abonnentenHinzufuegen(herrMueller);
    edeka.abonnentenHinzufuegen(frauSchmid);

    edeka.proukteHizufuegen("Banane");
    edeka.proukteHizufuegen("Kiwi");
    edeka.proukteHizufuegen("Cola");
    edeka.proukteHizufuegen("Tee");
    edeka.proukteHizufuegen("Milch");

    edeka.neuerProduktkatalogVersenden();
  }
}