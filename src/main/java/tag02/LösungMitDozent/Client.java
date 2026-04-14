package tag02.LösungMitDozent;

public class Client {

  public static void main(String[] args) {
    // Objekt erzeugen -> Veröffentlicher
    Veröffentlicher moderatorDeutsch = new Veröffentlicher();
    Veröffentlicher moderatorEnglisch = new Veröffentlicher();

    // Objekt erzeugen -> Websiten
    Website w1 = new Website("kicker.de");
    Website w2 = new Website("tipico.de");

    // Objekt erzeugen -> Fans
    Fan f1 = new Fan("Jan", "01523333333", true);
    Fan f2 = new Fan("Anna", "016523456", true);
    Fan f3 = new Fan("John", "00441111111", false);

    // Beobachter zur Liste hinzufügen
    moderatorDeutsch.fügeBeobachterHinzu(f1);
    moderatorDeutsch.fügeBeobachterHinzu(f2);
    moderatorDeutsch.fügeBeobachterHinzu(w1);
    moderatorDeutsch.fügeBeobachterHinzu(w2);

    moderatorEnglisch.fügeBeobachterHinzu(f3);

    // Spielstand veröffentlichen
    moderatorDeutsch.benachrichtigeBeobachter(
        "Spiel Deutschland gegen England hat gestartet. Wir dürfen gespannt sein.");
    moderatorEnglisch.benachrichtigeBeobachter("Germany vs England started.");
  }
}
