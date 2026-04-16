package tag04.hausAufgabe.ha3;

public class LegacyAdapter extends NewAPI {

  private final LegacyAPI legacyAPI;

  public LegacyAdapter(LegacyAPI legacyAPI) {
    this.legacyAPI = legacyAPI;
  }

  @Override
  public int calculateSum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum = legacyAPI.addNumbers(sum, numbers[i]);
    }

    return sum;
  }
}
