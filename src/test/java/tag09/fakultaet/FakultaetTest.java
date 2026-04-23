package tag09.fakultaet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FakultaetTest {

  @Test
  void testBerechne() {
    // assertEquals prüft ob die beiden Werte gleich sind, falls ja ist der Test grün und bestanden
    // 1. Parameter = erwartete Wert, 2. Parameter = der Wert den die Methode liefert
    assertEquals(1, Fakultaet.berechne(0));
    assertEquals(1, Fakultaet.berechne(1));
    assertEquals(2, Fakultaet.berechne(2));
    assertEquals(6, Fakultaet.berechne(3));
    assertEquals(24, Fakultaet.berechne(4));
        /*
        - Wir testen die berechne-Methode mit einigen bekannten Fakultätswerten.
        - Wir verwenden assertEuals um zu prüfen, ob das Ergebnis der berechne-Methode dem erwarteten Wert entspricht
         */
  }

  @Test
  void testBerechneMitNegativerZahl() {
    IllegalArgumentException ex =
        // Wir testen ob die berechne-Methode eine Ausnahme auslöst, wenn sie mit einer negativen Zahl aufgerufen wird
        assertThrows(IllegalArgumentException.class, () -> Fakultaet.berechne(-1));
    assertEquals("Die Zahl muss größer oder gleich 0 sein.", ex.getMessage());
  }
}