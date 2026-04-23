package tag09.fakultaet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FakultaetTest {

  @Test
  void berechne() {
    assertEquals(1, Fakultaet.berechne(0));
    assertEquals(1, Fakultaet.berechne(1));
    assertEquals(2, Fakultaet.berechne(2));
    assertEquals(6, Fakultaet.berechne(3));
    assertEquals(24, Fakultaet.berechne(4));
  }

  @Test
  void berechneMitNegativeParameter() {
    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> Fakultaet.berechne(-1));

    assertEquals("Die Zahl muss größer oder gleich 0 sein.", exception.getMessage());
  }
}