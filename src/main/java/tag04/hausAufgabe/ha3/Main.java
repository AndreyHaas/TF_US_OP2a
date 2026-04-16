package tag04.hausAufgabe.ha3;

public class Main {

  public static void main(String[] args) {
    NewAPI newAPI = new NewAPI();
    System.out.println("Mit neuer API  : " + newAPI.calculateSum(new int[]{2, 3, 4}));

    // Adapter verwenden (alte API wird ueber Adapter genutzt)
    LegacyAPI legacyAPI = new LegacyAPI();
    NewAPI adapter = new LegacyAdapter(legacyAPI);
    System.out.println("Mit Adapter    : " + adapter.calculateSum(new int[]{2, 3, 4}));
  }
}
