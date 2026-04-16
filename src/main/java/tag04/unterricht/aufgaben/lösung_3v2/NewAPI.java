package tag04.unterricht.aufgaben.lösung_3v2;

public class NewAPI {

  public int calculateSum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
