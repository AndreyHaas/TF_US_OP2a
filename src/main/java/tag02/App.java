package tag02;

public class App {

  public static void main(String[] args) {
    Veroeffentlicher veroeffentlicher = new Veroeffentlicher();

    WebSeite webSeite = new WebSeite("kicker.de");

    Fan jan = new Fan("Jan", "015251234567");

    veroeffentlicher.fuegeBeobachterHinzu(webSeite);
    veroeffentlicher.fuegeBeobachterHinzu(jan);

    veroeffentlicher.benachrichtigeBeobachter("Spiel Deutschland gegen England ist angefangen!");
  }
}
