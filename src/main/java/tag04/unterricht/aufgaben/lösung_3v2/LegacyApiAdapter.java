package tag04.unterricht.aufgaben.lösung_3v2;

public class LegacyApiAdapter extends NewAPI {

  private final LegacyAPI legacyAPI;

  public LegacyApiAdapter(LegacyAPI legacyAPI) {
    this.legacyAPI = legacyAPI;
  }

  @Override
  public int calculateSum(int[] numbers) {
    int summe = 0;
      for (int number : numbers) {
          summe = legacyAPI.addNumbers(summe, number);
      }

    return summe;
  }
}
