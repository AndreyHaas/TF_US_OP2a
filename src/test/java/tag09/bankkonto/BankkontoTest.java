package tag09.bankkonto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankkontoTest {

  Bankkonto konto;
  // Bevor eine Testmethode ausgeführt wird, wird die Methode unter der Annotation @BeforeEach ausgeführt
  // damit für jeden Test ein neues Objekt erzeugt wird
  @BeforeEach
  void vorbereitung() {
    konto = new Bankkonto(100);
  }

  @Test
  void testEinzahlen() {
    // 1. Parameter = erwarteter Wert, 2. Parameter = Rückgabewert den Methode liefert
    // werden auf übereinstimmung geprüft, falls korrekt wird der Testlauf grün

    // positiver Übergabeparameter
    assertEquals(150, konto.einzahlen(50)); //-> Test grün

    // negativer Übergabeparameter
    assertEquals(150,
        konto.einzahlen(-20)); // -> Test grün, Rückgabe verändert sich nicht, bei Minusübergabewert

    // Übergabeparameter 0
    assertEquals(150, konto.einzahlen(0)); // -> Test grün, Rückgabe bleibt bei Ursprungsbetrag

    // assertEquals gibt es auch mit drei Übergabeparameter, der dritte gibt die erlaubte Toleranz/ Abweichung an
    assertEquals(250.004, konto.einzahlen(100), 0.009);

  }

  @Test
  @DisplayName("Tests um Geld abzuheben")
    //so steht in der Testanzeige nicht der Methodenname, sondern dieser String
  void testAbheben() {
    // Positiver Übergabewert zb. 50 € wird von Guthaben reduziert
    assertEquals(50, konto.abheben(50)); // Test erfolgreich

    // Negativer Übergabewert zb. -100€ Guthaben bleibt unverändert
    assertEquals(50, konto.abheben(-100));

    // Übergabewert 0 Guthaben bleibt unverändert
    assertEquals(50, konto.abheben(0));

    // Versuch mehr abzuheben als aktuell auf dem Konto
    // da das Konto nicht ins Minus gehen darf sollten noch 50 Euro bleiben
    assertEquals(50, konto.abheben(100));
  }

  @Test
  void testGetGuthaben() {
    assertNotEquals(20, konto.getGuthaben());
    assertEquals(100, konto.getGuthaben());
  }
}