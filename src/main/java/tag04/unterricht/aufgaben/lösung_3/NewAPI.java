package tag04.unterricht.aufgaben.lösung_3;

// Eine neue API, mit der wir nun Arrays von Zahlen addieren können, anstatt nur zwei Zahlen.
public class NewAPI {

  public int calculateSum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}

