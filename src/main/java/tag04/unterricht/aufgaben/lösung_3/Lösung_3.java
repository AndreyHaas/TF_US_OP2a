package tag04.unterricht.aufgaben.lösung_3;

public class Lösung_3 {

  public static void main(String[] args) {
    // Objekt der LegacyAPI erstellen und mit dem Adapter-Objekt umhüllen:
    LegacyAPI legacy = new LegacyAPI();
    NewAPI newAPI = new Adapter(legacy);

    // Der Adapter verwendet nun die LegacyAPI, um das Ergebnis zu berechnen.
    System.out.println("Mit Adapter : " + newAPI.calculateSum(new int[]{2, 3, 4}));
  }
}
