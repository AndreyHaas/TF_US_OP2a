package tag04.unterricht.aufgaben.lösung_3;

// Wir wollen nun aber nicht den Algorithmus der neuen API verwenden, sondern weiterhin auf die alte API zugreifen.
// Leider sind die Parameter der alten API nicht mit denen der neuen kompatibel. Der Adapter schafft hier die Lösung:
public class Adapter extends NewAPI {

  private final LegacyAPI legacyApi;

  public Adapter(LegacyAPI legacyApi) {
    this.legacyApi = legacyApi;
  }

  @Override
  public int calculateSum(int[] numbers) {
    int sum = 0;

      for (int number : numbers) {
          sum = legacyApi.addNumbers(sum, number);
      }
    // Wir wandeln die übergebenen Informationen so um, dass die alte API damit arbeiten kann.

    return sum;
  }
}
