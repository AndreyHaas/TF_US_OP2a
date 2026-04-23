package tag09.fakultaet;

//Factorial berechnen
public class Fakultaet {
  public static long berechne(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Die Zahl muss größer oder gleich 0 sein.");
    }

    long ergebnis = 1;

    for (int i = 2; i <= n; i++) {
      ergebnis *= i;
    }

    return ergebnis;
  }
}