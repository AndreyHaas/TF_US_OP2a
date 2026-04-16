package tag04.unterricht.aufgaben.lösung_3v2;

public class Client {

  private static NewAPI newAPI = new NewAPI();

  public static void main(String[] args) {
    newAPI = new LegacyApiAdapter(new LegacyAPI());
    int[] zahlen = {1, 2, 3};
    printSum(zahlen);
  }

  public static void printSum(int[] werte) {
    System.out.println(newAPI.calculateSum(werte));
  }
}
